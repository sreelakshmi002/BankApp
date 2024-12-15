package com.banking.models.account;

import com.banking.enums.TransactionType;
import com.banking.models.transsactions.Transaction;
import com.banking.models.user.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class SavingAccount extends Account {

    ArrayList<Transaction> transactionHistory = new ArrayList<>();
    double minimumBalance;
    double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(ArrayList<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public SavingAccount() {
        super();
    }
    public SavingAccount(String accNumber, Customer holder) {
        super(accNumber, holder);
        this.minimumBalance = 1000;
        this.interestRate = 3;


    }
}
