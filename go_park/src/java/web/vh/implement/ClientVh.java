/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.vh.implement;

import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.app.implement.Resultado;
import model.dominio.EntidadeDominio;
import model.dominio.implement.Cidade;
import model.dominio.implement.Client;
import model.dominio.implement.Endereco;
import model.dominio.implement.Estado;
import model.dominio.implement.Plano;
import model.dominio.implement.Veiculo;
import web.vh.IVh;

/**
 *
 * @author matheus96
 */
public class ClientVh implements IVh{

    @Override
    public EntidadeDominio getEntidade(HttpServletRequest request) {
        
        Client client = new Client();

        EstadoVh evh = new EstadoVh();
        EntidadeDominio estado = evh.getEntidade(request);
        
        CidadeVh cvh = new CidadeVh();
        EntidadeDominio cidade = cvh.getEntidade(request, (Estado)estado);
        
        EnderecoVh endvh = new EnderecoVh();
        EntidadeDominio endereco = endvh.getEntidade(request, (Cidade)cidade);

        client.setEndereco((Endereco)endereco);
        
        EntidadeDominio plano = new Plano();
        
        if(request.getParameter("tipo_plano").equals("")){
            Plano_fixoVh planovh = new Plano_fixoVh();
            plano = planovh.getEntidade(request);
        }else{
            Plano_horasVh planovh = new Plano_horasVh();
            plano = planovh.getEntidade(request);
        }
        
        client.setPlano((Plano)plano);
        
        //add veiculo to client
        
        client.setNome(request.getParameter("nome"));
        client.setCpf(request.getParameter("cpf"));
        client.setEmail(request.getParameter("email"));
        if(request.getParameter("date") != null){
            client.setDate_nasc(Date.valueOf(request.getParameter("date")));
        }
        client.setSexo(request.getParameter("sexo"));
        client.setTel(request.getParameter("tel"));
        client.setCel(request.getParameter("cel"));
         
        String id = request.getParameter("id");
        
        if ( id != null && !id.trim().equals("")) {
            client.setId(Integer.parseInt(id));
        }
        else{
            client.setId(null);
        }
        
        return client;
    }

    @Override
    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (resultado.getMessage()!= null) {
            request.setAttribute("message", resultado.getMessage());
			
            request.getRequestDispatcher("erro.jsp").forward(request, response);
	} else  {
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
    }
    
}
