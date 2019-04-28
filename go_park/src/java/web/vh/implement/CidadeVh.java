/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.vh.implement;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.app.implement.Resultado;
import model.dominio.EntidadeDominio;
import model.dominio.implement.Cidade;
import model.dominio.implement.Estado;
import web.vh.IVh;

/**
 *
 * @author matheus96
 */
public class CidadeVh implements IVh{

    private static Map<String, String> nomes_cidades;
    
    @Override
    public EntidadeDominio getEntidade(HttpServletRequest request) {
        Cidade cidade = new Cidade();
        
        //simulando uma consulda dos nomes dos estados
        nomes_cidades = new HashMap<>();
        nomes_cidades.put("1", "Mogi das Cruzes");
        nomes_cidades.put("2", "Suzano");
        nomes_cidades.put("3", "Biritiba Mirim");
        nomes_cidades.put("4", "Guararema");
        
        cidade.setId(Integer.parseInt(request.getParameter("id_cidade")));
        cidade.setNome(nomes_cidades.get(request.getParameter("id_cidade")));
        
        return cidade;
    }

    public EntidadeDominio getEntidade(HttpServletRequest request, Estado estado) {
        Cidade cidade = new Cidade();
        
        cidade.setId(Integer.parseInt(request.getParameter("id_cidade")));
        cidade.setNome(request.getParameter("nome_cidade"));
        cidade.setEstado(estado);
        
        return cidade;
    }
    
    @Override
    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
