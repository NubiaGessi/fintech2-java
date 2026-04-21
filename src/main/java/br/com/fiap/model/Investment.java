package br.com.fiap.model;

public class Investment {
    //Atributos
    String investmentDate;
    String investmentDescription;
    double investmentValue;

    //Construtores
    public Investment(String investmentDate, String investmentDescription, double investmentValue) {
        this.investmentDate = investmentDate;
        this.investmentDescription = investmentDescription;
        this.investmentValue = investmentValue;
    }

    //Metodo Exibir investimento
    public void showInvestiment(){
        System.out.println("Método para exibir um investimento: Adicionando um investimento, na data de: " +investmentDate+ ", com a descrição: " +investmentDescription+ ", e com o valor de: " +investmentValue+" chamado.");
    }

    //Metodo Validação do investimento
    public void isValid() {
        System.out.println("Método para validação do investimento.");
    }

    //Metodo Atualizar valor com aporte adicional
    public void updateInvestmentValue() {
        System.out.println("Método para atualizar valor de investimento.");
    }

    //Metodo Calcular lucro/prejuízo com base no valor atual de mercado
    public void calculateProfit() {
        System.out.println("Método para calcular lucro/prejuízo do investimento.");
    }

    //Metodo Verificar se está dando lucro
    public void isProfitable() {
        System.out.println("Método para verificar se está dando lucro chamado.");
    }

    //Getters and Setters

    public String getInvestmentDate() {
        return investmentDate;
    }

    public void setInvestmentDate(String investmentDate) {
        this.investmentDate = investmentDate;
    }

    public String getInvestmentDescription() {
        return investmentDescription;
    }

    public void setInvestmentDescription(String investmentDescription) {
        this.investmentDescription = investmentDescription;
    }

    public double getInvestmentValue() {
        return investmentValue;
    }

    public void setInvestmentValue(double investmentValue) {
        this.investmentValue = investmentValue;
    }
}

