package model.dominio.implement;

import model.dominio.EntidadeDominio;

public class Client extends EntidadeDominio{
    private String name_client;
    private String cpf_client;
    private String email_client;
    private String data_nasc_client;
    private String sexo_client;
    private String tel_client;
    private String cel_client;

    public String getName_client() {
        return name_client;
    }

    public void setName_client(String name_client) {
        this.name_client = name_client;
    }

    public String getCpf_client() {
        return cpf_client;
    }

    public void setCpf_client(String cpf_client) {
        this.cpf_client = cpf_client;
    }

    public String getEmail_client() {
        return email_client;
    }

    public void setEmail_client(String email_client) {
        this.email_client = email_client;
    }

    public String getData_nasc_client() {
        return data_nasc_client;
    }

    public void setData_nasc_client(String data_nasc_client) {
        this.data_nasc_client = data_nasc_client;
    }

    public String getSexo_client() {
        return sexo_client;
    }

    public void setSexo_client(String sexo_client) {
        this.sexo_client = sexo_client;
    }

    public String getTel_client() {
        return tel_client;
    }

    public void setTel_client(String tel_client) {
        this.tel_client = tel_client;
    }

    public String getCel_client() {
        return cel_client;
    }

    public void setCel_client(String cel_client) {
        this.cel_client = cel_client;
    }
}