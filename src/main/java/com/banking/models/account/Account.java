package com.banking.models.account;

import com.banking.models.user.Customer;

import java.time.LocalDate;

public class Account {
    String accNumber;
    double balance;
    Customer holder;
    LocalDate creationDate;


    public Account() {

    }

    public Account(String accNumber, Customer holder) {
        this.accNumber = accNumber;
        this.balance = 0;
        this.holder = holder;
        this.creationDate = LocalDate.now();
    }


}
