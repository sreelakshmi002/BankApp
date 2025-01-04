package com.banking.services;

import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;

import java.util.ArrayList;

public interface ISavingAccountService {

        SavingAccount createSavingAccount(String accNumber, String phoneNumber);
        public Customer findCustomerByPhoneNumber(String phoneNumber);
        public void printSavingAccountDetails(String accNumber);
        public SavingAccount returnAccountNumber(String accNumber);
        public void printAccountBalance(String accNumber);
        public void printMinimumBalance(String accountNumber);
        public double deposit(double depositAmount,String accNumber);
        public double withdraw(double withdrawAmount,String accNumber);
        public void transfer(double transferAmount,  String sourceAccountNumber, String destinationAccountNumber);



}
