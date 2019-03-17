/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.command;

import model.dominio.EntidadeDominio;
import model.app.implement.Resultado;
/**
 *
 * @author matheus96
 */
public interface ICommand {
    public Resultado execute(EntidadeDominio entidade);
}
