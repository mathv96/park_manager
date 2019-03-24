/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dominio.implement;

import model.dominio.EntidadeDominio;

/**
 *
 * @author matheus96
 */
public class Estado extends EntidadeDominio{
    private String nome;
    private final String pais = "Brasil";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }
}
