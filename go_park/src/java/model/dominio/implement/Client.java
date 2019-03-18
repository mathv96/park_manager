package model.dominio.implement;

import model.dominio.EntidadeDominio;

public class Client extends EntidadeDominio{
    private String name;
    private String cpf;
    private String email;
    private String sexo;
    private String tel;
    private String cel;
    private String dast_nasc;

    public String getDast_nasc() {
        return dast_nasc;
    }

    public void setDast_nasc(String dast_nasc) {
        this.dast_nasc = dast_nasc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

   
}