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
import model.dominio.implement.Plano_fixo;
import web.vh.IVh;

/**
 *
 * @author matheus96
 */
public class Plano_fixoVh implements IVh{

    @Override
    public EntidadeDominio getEntidade(HttpServletRequest request) {
        Plano_fixo pf = new Plano_fixo();
        
        pf.setId(Integer.parseInt(request.getParameter("id_plano")));
        if(request.getParameter("dias_plano") != null){
            pf.setDias(null);
        }
        if(request.getParameter("tipo_plano") != null){
            pf.setTipo(request.getParameter("tipo_plano"));
        }
        if(request.getParameter("valor_plano") != null){
            pf.setValor(Double.parseDouble(request.getParameter("valor_plano")));
        }
        
        return pf;
    }

    @Override
    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
