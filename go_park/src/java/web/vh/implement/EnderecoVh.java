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
import model.dominio.implement.Cidade;
import model.dominio.implement.Endereco;
import web.vh.IVh;

/**
 *
 * @author matheus96
 */
public class EnderecoVh implements IVh{

    @Override
    public EntidadeDominio getEntidade(HttpServletRequest request) {
        
        Endereco endereco = new Endereco();
        
        endereco.setNome(request.getParameter("nome_endereco"));
        endereco.setRua(request.getParameter("rua"));
        endereco.setBairro(request.getParameter("bairro"));
        endereco.setCep(request.getParameter("cep"));
        endereco.setNumero_casa(Integer.parseInt(request.getParameter("numero_casa")));
        endereco.setComplemento(request.getParameter("complemento"));
        endereco.setReferencia(request.getParameter("referencia"));
        
        return endereco;
    }
    
    public EntidadeDominio getEntidade(HttpServletRequest request, Cidade cidade) {

        Endereco endereco = new Endereco();

        endereco.setNome(request.getParameter("nome_endereco"));
        endereco.setRua(request.getParameter("rua"));
        endereco.setBairro(request.getParameter("bairro"));
        endereco.setCep(request.getParameter("cep"));
        endereco.setNumero_casa(Integer.parseInt(request.getParameter("numero_casa")));
        endereco.setComplemento(request.getParameter("complemento"));
        endereco.setReferencia(request.getParameter("referencia"));
        endereco.setCidade(cidade);

        return endereco;
    }

    @Override
    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
