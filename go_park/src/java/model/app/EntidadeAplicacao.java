/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.app ;

import java.util.List;
import model.IEntidade;
/**
 *
 * @author matheus96
 */
public class EntidadeAplicacao implements IEntidade{
    
    private String message;
    private List<IEntidade> entidades;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<IEntidade> getEntidades() {
        return entidades;
    }

    public void setEntidades(List<IEntidade> entidades) {
        this.entidades = entidades;
    }
    
    
    
}
