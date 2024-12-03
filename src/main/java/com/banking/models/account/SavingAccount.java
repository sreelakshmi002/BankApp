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

    public SavingAccount() {
        super();
    }
    public SavingAccount(String accNumber, Customer holder) {
        super(accNumber, holder);
        this.minimumBalance = 1000;
        this.interestRate = 3;
//        holder.addAccList(this);

    }
}
