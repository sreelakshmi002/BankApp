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
    public Account(String accNumber,Customer holder){
        this.accNumber=accNumber;
        this.balance=0;
        this.holder=holder;
        this.creationDate=LocalDate.now();
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


    public abstract  String getDetails();
    public String getaccDetails(){

            String detail= "Account Number: " + accNumber + "\n"+
                           " Balance: " + balance + " \n"+
                           " Holder: " + holder.getName() +"\n"+
                           "Created On: " + creationDate;
            return detail;
    }

}
