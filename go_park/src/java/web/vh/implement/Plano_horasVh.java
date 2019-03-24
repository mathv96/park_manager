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
import model.dominio.implement.Plano_horas;
import web.vh.IVh;

/**
 *
 * @author matheus96
 */
public class Plano_horasVh implements IVh{

    @Override
    public EntidadeDominio getEntidade(HttpServletRequest request) {
        
        Plano_horas ph = new Plano_horas();
        
        ph.setId(Integer.parseInt(request.getParameter("id_plano")));
        if(request.getParameter("horas_plano") != null){
            ph.setHoras(Double.parseDouble(request.getParameter("horas_plano")));
        }
        if(request.getParameter("tipo_plano") != null){
            ph.setTipo(request.getParameter("tipo_plano"));
        }
        if(request.getParameter("valor_plano") != null){
            ph.setValor(Double.parseDouble(request.getParameter("valor_plano")));
        }
        
        return ph;
    }

    @Override
    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
