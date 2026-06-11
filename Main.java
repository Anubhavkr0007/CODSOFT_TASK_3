package com.atm;

public class Main {

    static void main() {

        SavingsAccount account =
                new SavingsAccount(1001, "Anubhav", 10000, 5);

        account.checkBalance();

        account.addInterest();

        account.checkBalance();
    }
}