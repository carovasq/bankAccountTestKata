package org.example;

public class BankAccount {
    private  String titular;
    private double balance;

    //Constructor
    public BankAccount(String titular, double initialBalance) {
        this.titular = titular;
        this.balance = initialBalance;
    }

    //Getter
    public String getTitular() {
        return titular;
    }
    public double getBalance() {
        return balance;
    }
}
