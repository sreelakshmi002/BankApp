package com.banking.models.account;

import com.banking.models.user.Customer;

import java.time.LocalDate;

public abstract class Account {
    String accNumber;
    double balance;
    Customer holder;
    LocalDate creationDate;

    public  abstract  void withdraw();
    public abstract void calculateInterest();

    public Account(){

    }
    public Account(String accNumber,double balance,Customer holder,LocalDate creationDate){
        this.accNumber=accNumber;
        this.balance=balance;
        this.holder=holder;
        this.creationDate=creationDate;
    }
    public String getAccNumber(){
        return accNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("balance after depositing amount "+balance);
    }
    public String getDetail(){
        return "Account Number: " + accNumber + ", Balance: " + balance +
                ", Holder: " + holder.getName() + ", Created On: " + creationDate;

    }

}
