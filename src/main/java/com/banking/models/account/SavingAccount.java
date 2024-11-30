package com.banking.models.account;

import com.banking.models.user.Customer;

import java.time.LocalDate;

public class SavingAccount extends Account {
    double minimumBalance;
    double interestRate;


    public SavingAccount() {
        super();
    }

    public SavingAccount(String accNumber, Customer holder) {
        super(accNumber, holder);
        this.minimumBalance = 1000;
        this.interestRate = 3;
        holder.addAccList(this);
    }

    @Override
    public String getDetails() {
        String details = getaccDetails();
        details = details + "\n" + " MinimumBalance:" + minimumBalance + " \n " +
                "InterestRate: " + interestRate + " \n ";

        return details;
    }


    @Override
    public void withdraw(double amount, Customer customer) {

        if (customer==holder) {
            if(balance-amount>minimumBalance){
                balance-=amount;
            }else {
                System.out.println("Insufficient Balance!");
            }
        }else{
            System.out.println("Given customer are not matching!");
        }

    }


    @Override
    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        System.out.println(interest);
    }

    @Override
    public void deposit(double amount,String accountNumber) {
        if (accountNumber.equals(accNumber)) {
            balance+=amount;
            System.out.println("Amount deposited : "+amount+" Balance after depositing :"+balance);
        }else {
            System.out.println("Wrong Account Number!");
        }

    }

    public void transferMoney(Account source,Account destination,double transferAmount){
                if(source.balance>minimumBalance){
                    System.out.println("You can transfer money");

                    source.balance-=transferAmount;
                    System.out.println("Balance after transferring money : "+source.balance);
                    System.out.println("__________________");
                    destination.balance+=transferAmount;
                    System.out.println("Balance after receiving  money : "+destination.balance);

                }else {
                    System.out.println("MinimumBalance is required");
                }

    }


}
