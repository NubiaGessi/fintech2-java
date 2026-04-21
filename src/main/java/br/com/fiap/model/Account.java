package br.com.fiap.model;

public class Account {
    //Atributos
    String agency;
    String account;

    //Construtores
    public Account (String agency, String account) {
        this.agency = agency;
        this.account = account;
    }
    //Metodo Exibir conta
    public void showAccount (){
        System.out.println("Método para exibir a conta: Agência:" + agency + " Conta:" + account);
    }

    //Getters and Setters
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
