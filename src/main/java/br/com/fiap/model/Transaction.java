package br.com.fiap.model;

// Superclasse
public abstract class Transaction {
    //Atributos comuns a todas as transações
    private String transactionDate;
    private String transactionDescription;
    private double transactionValue;

    //Construtores
    public Transaction() {
    }

    public Transaction(String transactionDate, String transactionDescription, double transactionValue) {
        this.transactionDate = transactionDate;
        this.transactionDescription = transactionDescription;
        this.transactionValue = transactionValue;
    }

    //Metodo exibir transação
    public String showTransaction() {
        String messageShowTransaction = "Método para exibir a transação: Adicionando uma transação na data de: " + transactionDate + ", com a descrição: " + transactionDescription + ", e com o valor de: " + transactionValue;
        System.out.println(messageShowTransaction);
        return messageShowTransaction;
    }

    //Metodo editar transação
    public String editTransaction() {
        String messageEditTransaction = "Método edição da transação";
        System.out.println(messageEditTransaction);
        return messageEditTransaction;
    }

    //Metodo abstrato
    public abstract String getResume();

    //Getters and Setters
    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public double getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(double transactionValue) {
        this.transactionValue = transactionValue;
    }
}
