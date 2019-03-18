/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.vh.implement;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.app.implement.Resultado;
import model.dominio.EntidadeDominio;
import model.dominio.implement.Client;
import web.vh.IVh;

/**
 *
 * @author matheus96
 */
public class ClientVh implements IVh{

    @Override
    public EntidadeDominio getEntidade(HttpServletRequest request) {
        
        Client client = new Client();
        
        client.setName(request.getParameter("name"));
        client.setCpf(request.getParameter("cpf"));
        client.setEmail(request.getParameter("email"));
        client.setDast_nasc(null);
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
