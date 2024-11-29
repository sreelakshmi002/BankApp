package com.banking.models.account;

import com.banking.models.user.Customer;

import java.time.LocalDate;

public class SavingAccount extends Account{
    double minimumBalance;
    double interestRate;


    public SavingAccount(){

        super();
    }
    public SavingAccount(String accNumber,Customer holder){

            super(accNumber,holder);

            this.minimumBalance=1000;
            this.interestRate=3;
            holder.addAccList(this);
    }

    @Override
    public String getDetails() {
        String details=getaccDetails();
        details= details+"\n"+" MinimumBalance:"+minimumBalance +" \n " +
                "InterestRate: " +interestRate+ " \n ";

        return details;
    }




    @Override
    public void withdraw() {

    }

    @Override
    public void calculateInterest() {

    }
}
