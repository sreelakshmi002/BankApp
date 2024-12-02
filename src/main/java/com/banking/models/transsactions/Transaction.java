package com.banking.models.transsactions;


import com.banking.enums.TransactionType;

import java.util.Date;

public class Transaction {
    double amount;
    TransactionType transactionType;
    Date transactionTime;


    public Transaction(){

    }
    public Transaction(double amount,TransactionType transactionType,Date transactionTime){
        this.amount=amount;
        this.transactionType=transactionType;
        this.transactionTime=new Date();

    }

    public void printTransactionDetails(){
        System.out.println("Amount :"+amount);
        System.out.println("TransactionTime: "+transactionTime);
        System.out.println("TransactionType: " +transactionType);
    }


}

