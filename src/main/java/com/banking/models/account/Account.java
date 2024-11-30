package com.banking.models.account;

import com.banking.models.user.Customer;

import java.time.LocalDate;

public abstract class Account {
    String accNumber;
    double balance;
    Customer holder;
    LocalDate creationDate;


    public abstract void withdraw(double amount, Customer customer);

    public abstract void calculateInterest();
    public abstract void deposit(double amount,String accountNumber);


    public Account() {

    }

    public Account(String accNumber, Customer holder) {
        this.accNumber = accNumber;
        this.balance = 0;
        this.holder = holder;
        this.creationDate = LocalDate.now();
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }


    public abstract String getDetails();

    public String getaccDetails() {

        String detail = "Account Number: " + accNumber + "\n" +
                " Balance: " + balance + " \n" +
                " Holder: " + holder.getName() + "\n" +
                "Created On: " + creationDate;
        return detail;
    }


}
