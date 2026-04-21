package br.com.fiap.model;

public class Goal {
    //Atributos
    String goalDate;
    String goalDescription;
    double goalValue;

    //Construtores
    public Goal(String goalDate, String goalDescription, double goalValue) {
        this.goalDate = goalDate;
        this.goalDescription = goalDescription;
        this.goalValue = goalValue;
    }

    //Metodo Exibir meta
    public void showGoal() {
        System.out.println("Método para exibir uma meta: Adicionando uma meta, na data de: " + goalDate + ", com a descrição: " + goalDescription + ", e com o valor de: " + goalValue);
    }

    //Metodo Atualizar valor meta
    public void updateGoalValue() {
        System.out.println("Método para atualizar valor da meta.");
    }

    //Metodo Calcular porcentagem de progresso
    public void calculateProgressPercentage() {
        System.out.println("Método para calcular o progresso do valor da meta.");
    }

    //Metodo Acompanhamento se bateu a meta
    public void followUpGoal() {

        System.out.println("Método para acompanhar se bateu a meta.");
    }

    //Getters and Setters

}

