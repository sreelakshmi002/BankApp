package com.banking.models.account;

import com.banking.models.user.Customer;

import java.time.LocalDate;

public class SavingAccount extends Account{
    double minimumBalance;
    double interestRate;


    public SavingAccount(){
        super();
    }
    public SavingAccount(String accNumber, double balance, Customer holder, LocalDate creationDate,double minimumBalance,double interestRate){
            super(accNumber,balance,holder,creationDate);
            this.minimumBalance=minimumBalance;
            this.interestRate=interestRate;
    }





    @Override
    public void withdraw() {

    }

    @Override
    public void calculateInterest() {

    }
}
