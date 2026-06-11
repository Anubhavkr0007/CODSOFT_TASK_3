package com.atm;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder,double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {

        balance += amount;

        System.out.println(
                "₹" + amount +
                        " deposited successfully.");
    }
    public void withdraw(double amount)
            throws Exception {

        if(amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient Balance");
        }

        balance -= amount;

        System.out.println(
                "₹" + amount +
                        " withdrawn successfully.");
    }
    public void checkBalance() {

        System.out.println(
                "Current Balance: ₹"
                        + balance);
    }
    @Override
    public String toString() {

        return "Account Number : "
                + accountNumber
                + "\nAccount Holder : "
                + accountHolder
                + "\nBalance : ₹"
                + balance;
    }
}
