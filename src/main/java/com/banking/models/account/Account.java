package com.banking.models.account;

import com.banking.models.user.Customer;

import java.time.LocalDate;

public class Account {
    String accNumber;
    double balance;
    Customer holder;
    LocalDate creationDate;

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Customer getHolder() {
        return holder;
    }

    public void setHolder(Customer holder) {
        this.holder = holder;
    }

    public Account() {

    }

    public Account(String accNumber, Customer holder) {
        this.accNumber = accNumber;
        this.balance = 0;
        this.holder = holder;
        this.creationDate = LocalDate.now();
    }


}
