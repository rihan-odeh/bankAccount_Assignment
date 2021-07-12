package com.example.bankaccount_assignment;

import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance, savingBalance;
    private static int accountCount;
    private static double totalMoney;

    public BankAccount(){
        this.accountNumber= String.valueOf(generateAccountNumber());
        accountCount++;
    }

    private String generateAccountNumber() {
        Random random = new Random();
        this.accountNumber= "" +((1 + random.nextInt(2)) * 9999 + random.nextInt(99)+ random.nextInt(2)) * 9999 + random.nextInt(99);
       // return "" +(random.nextInt((9999 - 100) + 1) + 10)+(random.nextInt((9999 - 100) + 1) + 10);
        return this.accountNumber;

    }
    public void addToAccount(double amount){
        totalMoney +=amount;
    }
    public String withdraw(double amount){
        if(totalMoney<amount)
            return"Could not complete the process.";
        else totalMoney -=amount;
        return "Success";
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static int getAccountCount() {
        return accountCount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


}
