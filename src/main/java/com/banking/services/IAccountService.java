package com.banking.services;

import com.banking.models.account.Account;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;

import java.util.ArrayList;

public interface IAccountService {

        SavingAccount createdSavingAccount(String accNumber, Customer holder);

        public void printSavingAccountDetails(SavingAccount  createdSavingAccount);
        public double balance(SavingAccount  createdSavingAccount);
        public void minimumBalance(SavingAccount  createdSavingAccount);
        public double deposit(double depositAmount,double balance,SavingAccount createdSavingAccount);
        public double withdraw(double withdrawAmount,SavingAccount createdSavingAccount,double balance);
        public void transfer(double transferAmount, SavingAccount sourceAccount,
                             SavingAccount destinationAccount);
        public void printAccountDetails(ArrayList<SavingAccount> accountArrayList);


}
