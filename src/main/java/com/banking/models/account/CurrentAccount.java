package com.banking.models.account;

import com.banking.models.user.Customer;

import java.time.LocalDate;

public class CurrentAccount extends Account{

    public CurrentAccount(){

    }
    public CurrentAccount(String accNumber, double balance, Customer holder, LocalDate creationDate){
        super(accNumber,balance,holder,creationDate);
    }
    @Override
    public void withdraw() {

    }

    @Override
    public void calculateInterest() {

    }
}
