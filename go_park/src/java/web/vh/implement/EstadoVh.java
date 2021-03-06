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
import model.dominio.implement.Estado;
import web.vh.IVh;


/**
 *
 * @author matheus96
 */
public class EstadoVh implements IVh{
    
    private static Map<String, String> nomes_estados;

    @Override
    public EntidadeDominio getEntidade(HttpServletRequest request) {
        
        Estado estado = new Estado();
        
        //simulando uma consulda dos nomes dos estados
        nomes_estados = new HashMap<>();
        nomes_estados.put("1", "São Paulo");
        
        estado.setId(Integer.parseInt(request.getParameter("id_estado")));
        estado.setNome(nomes_estados.get(request.getParameter("id_estado")));
       
        return estado;
    }

    @Override
    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
