package com.banking.services;

import com.banking.models.account.Account;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;

import java.util.ArrayList;

public interface IAccountService {

        SavingAccount savingAccount(String accNumber, Customer holder);

        public void printSavingAccountDetails(SavingAccount savingAccount);
        public double balance(SavingAccount savingAccount);
        public void minimumBalance(SavingAccount savingAccount);
        public double deposit(double depositAmount,double balance,SavingAccount savingAccount);
        public double withdraw(double withdrawAmount,SavingAccount savingAccount,double balance);
        public void transfer(double transferAmount, SavingAccount sourceAccount,
                             SavingAccount destinationAccount);


}
