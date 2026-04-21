package br.com.fiap.model;

//Subclasse
public class Expense extends Transaction{
    public Expense(){
        super();
    }

    public Expense(String transactionDate, String transactionDescription, double transactionValue){
        super(transactionDate, transactionDescription, transactionValue);
    }

    @Override
    public String getResume() {
        return "Tipo: Despesa | Data: " + getTransactionDate() + " | Descrição: " + getTransactionDescription()+ " | Valor: " + getTransactionValue();
    }
}
