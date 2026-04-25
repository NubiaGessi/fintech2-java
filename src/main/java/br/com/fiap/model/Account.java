package br.com.fiap.model;

public class Account {
    //Atributos
    String nr_agencia;
    String nr_conta;
    Long id_conta;
    String ds_nome;
    String ds_tipo;
    Double vl_saldo_atual;
    Long id_usuario;

    //Construtores
    public Account (String nr_agencia, String nr_conta, Long id_conta, String ds_nome, String ds_tipo, Double vl_saldo_atual, Long id_usuario) {
        this.nr_agencia = nr_agencia;
        this.nr_conta = nr_conta;
        this.id_conta = id_conta;
        this.ds_nome = ds_nome;
        this.ds_tipo = ds_tipo;
        this.vl_saldo_atual = vl_saldo_atual;
        this.id_usuario = id_usuario;
    }

   //Metodo Exibir conta
    public void showAccount (){
        System.out.println("Método para exibir a conta: Agência:" + nr_agencia + " Conta:" + nr_conta);
    }

    //Getters and Setters

    public String getNr_agencia() {
        return nr_agencia;
    }

    public void setNr_agencia(String nr_agencia) {
        this.nr_agencia = nr_agencia;
    }

    public String getNr_conta() {
        return nr_conta;
    }

    public void setNr_conta(String nr_conta) {
        this.nr_conta = nr_conta;
    }

    public Long getId_conta() {
        return id_conta;
    }

    public void setId_conta(Long id_conta) {
        this.id_conta = id_conta;
    }

    public String getDs_nome() {
        return ds_nome;
    }

    public void setDs_nome(String ds_nome) {
        this.ds_nome = ds_nome;
    }

    public String getDs_tipo() {
        return ds_tipo;
    }

    public void setDs_tipo(String ds_tipo) {
        this.ds_tipo = ds_tipo;
    }

    public Double getVl_saldo_atual() {
        return vl_saldo_atual;
    }

    public void setVl_saldo_atual(Double vl_saldo_atual) {
        this.vl_saldo_atual = vl_saldo_atual;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
}
