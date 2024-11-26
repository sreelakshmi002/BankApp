package com.banking.models.account;

import com.banking.models.user.Customer;

import java.time.LocalDate;

public class FixedDeposit extends Account{
    String duration;
    double maximumInterestRate;

    public  FixedDeposit(){
        super();
    }
    public FixedDeposit(String accNumber, double balance, Customer holder, LocalDate creationDate,String duration,double maximumInterestRate){
        super(accNumber,balance,holder,creationDate);
        this.duration=duration;
        this.maximumInterestRate=maximumInterestRate;
    }

    @Override
    public void withdraw() {

    }

    @Override
    public void calculateInterest() {

    }
}
