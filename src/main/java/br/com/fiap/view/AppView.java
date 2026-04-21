package br.com.fiap.view;

import br.com.fiap.model.*;

import java.util.Scanner;

public class AppView {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //ACCOUNT

        System.out.println("Informe a agência: ");
        String agency = sc.nextLine();

        System.out.println("Informe a conta: ");
        String account = sc.nextLine();

        Account account1 = new Account(agency, account);

        account1.showAccount();

        //GASTO

        System.out.println("Data do gasto: ");
        String transactionDate = sc.nextLine();

        System.out.println("Descrição do gasto: ");
        String transactionDescription = sc.nextLine();

        System.out.println("Valor do gasto: ");
        double transactionValue = sc.nextDouble();
        sc.nextLine();

        Expense expense = new Expense(transactionDate, transactionDescription, transactionValue);

        expense.showTransaction();
        expense.editTransaction();
        System.out.println(expense.getResume());

        //RECEITA

        System.out.println("Data da receita: ");
        String incomeDate = sc.nextLine();

        System.out.println("Descrição da receita: ");
        String incomeDescription = sc.nextLine();

        System.out.println("Valor da receita: ");
        double incomeValue = sc.nextDouble();
        sc.nextLine();

        Income income = new Income(incomeDate, incomeDescription, incomeValue);

        income.showTransaction();
        income.editTransaction();
        System.out.println(income.getResume());

        //META
        System.out.println("Data para atingir a meta: ");
        String goalDate = sc.nextLine();

        System.out.println("Descrição da meta: ");
        String goalDescription = sc.nextLine();

        System.out.println("Valor da meta: ");
        double goalValue = sc.nextDouble();
        sc.nextLine();

        Goal goal = new Goal(goalDate, goalDescription, goalValue);

        goal.showGoal();
        goal.updateGoalValue();
        goal.calculateProgressPercentage();
        goal.followUpGoal();

        //INVESTIMENTO

        System.out.println("Data do investimento: ");
        String investmentDate = sc.nextLine();

        System.out.println("Descrição do investimento: ");
        String investmentDescription = sc.nextLine();

        System.out.println("Valor do investimento: ");
        double investmentValue = sc.nextDouble();
        sc.nextLine();

        Investment investment = new Investment(investmentDate, investmentDescription, investmentValue);

        investment.showInvestiment();
        investment.isValid();
        investment.updateInvestmentValue();
        investment.calculateProfit();
        investment.isProfitable();

        sc.close();
    }
}



