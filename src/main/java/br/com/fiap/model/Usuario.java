package br.com.fiap.model;

import java.util.Date;

public class Usuario {
    //Atributos
    Long id_usuario;
    String ds_email;
    String pw_senha_hash;
    Date dt_cadastro;
    String nr_cpf_usuario;
    String ds_nome_usuario;
    String st_status;
    String ds_lgpd_consentimento;

    //construtores
    public Usuario() {
    }

    public Usuario(Long id_usuario, String ds_email, String pw_senha_hash, Date dt_cadastro, String nr_cpf_usuario, String ds_nome_usuario, String st_status, String ds_lgpd_consentimento) {
        this.id_usuario = id_usuario;
        this.ds_email = ds_email;
        this.pw_senha_hash = pw_senha_hash;
        this.dt_cadastro = dt_cadastro;
        this.nr_cpf_usuario = nr_cpf_usuario;
        this.ds_nome_usuario = ds_nome_usuario;
        this.st_status = st_status;
        this.ds_lgpd_consentimento = ds_lgpd_consentimento;
    }

    public Usuario(Long id_usuario, String ds_email, String pw_senha_hash, String nr_cpf_usuario, String ds_nome_usuario, String st_status, String ds_lgpd_consentimento) {
        this.id_usuario = id_usuario;
        this.ds_email = ds_email;
        this.pw_senha_hash = pw_senha_hash;
        this.nr_cpf_usuario = nr_cpf_usuario;
        this.ds_nome_usuario = ds_nome_usuario;
        this.st_status = st_status;
        this.ds_lgpd_consentimento = ds_lgpd_consentimento;
    }

    //Getters and Setters

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDs_email() {
        return ds_email;
    }

    public void setDs_email(String ds_email) {
        this.ds_email = ds_email;
    }

    public String getPw_senha_hash() {
        return pw_senha_hash;
    }

    public void setPw_senha_hash(String pw_senha_hash) {
        this.pw_senha_hash = pw_senha_hash;
    }

    public Date getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(Date dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    public String getNr_cpf_usuario() {
        return nr_cpf_usuario;
    }

    public void setNr_cpf_usuario(String nr_cpf_usuario) {
        this.nr_cpf_usuario = nr_cpf_usuario;
    }

    public String getDs_nome_usuario() {
        return ds_nome_usuario;
    }

    public void setDs_nome_usuario(String ds_nome_usuario) {
        this.ds_nome_usuario = ds_nome_usuario;
    }

    public String getSt_status() {
        return st_status;
    }

    public void setSt_status(String st_status) {
        this.st_status = st_status;
    }

    public String getDs_lgpd_consentimento() {
        return ds_lgpd_consentimento;
    }

    public void setDs_lgpd_consentimento(String ds_lgpd_consentimento) {
        this.ds_lgpd_consentimento = ds_lgpd_consentimento;
    }
}


