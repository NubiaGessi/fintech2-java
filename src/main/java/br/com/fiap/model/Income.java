package br.com.fiap.model;

//Subclasse - Herança
public class Income extends Transaction{
    //Construtores
    public Income(){
        super();
    }

    public Income(String transactionDate, String transactionDescription, double transactionValue){
        super(transactionDate, transactionDescription, transactionValue);
    }

    @Override
    public String getResume() {
        return "Tipo: Receita | Data: " + getTransactionDate() + " | Descrição: " + getTransactionDescription()+ " | Valor: " + getTransactionValue();
    }
}
