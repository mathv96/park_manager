/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.vh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dominio.EntidadeDominio;
import model.app.implement.Resultado;
/**
 *
 * @author matheus96
 */
public interface IVh {
    
    public EntidadeDominio getEntidade(HttpServletRequest request);
    
    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException;
    
}
