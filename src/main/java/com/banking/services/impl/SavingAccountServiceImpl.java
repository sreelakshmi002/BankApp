package com.banking.services.impl;

import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;
import com.banking.services.ISavingAccountService;

import java.util.ArrayList;


public class SavingAccountServiceImpl implements ISavingAccountService {

    static ArrayList<SavingAccount> accountArrayList = new ArrayList<>();
   CustomerServiceImpl customerService=new CustomerServiceImpl();

    // Incorrect :
    // Should input only customer mobile number and find the customer from that input
    // Add the created account to AccountList of customer also
    @Override
    public SavingAccount createSavingAccount(String accNumber, String phoneNumber) {

        Customer c = customerService.getCustomer(phoneNumber);
        if (c == null) {
            System.out.println("Customer not found with phone number: " + phoneNumber);
            return null;
        }

        SavingAccount account = new SavingAccount(accNumber, c);

        c.addAccount(account);
        accountArrayList.add(account);
        return account;

    }



    @Override
    public void printSavingAccountDetails(String accNumber) {
        SavingAccount s = returnAccountNumber(accNumber);
        if (s != null) {
            System.out.println("\n Account number:" + s.getAccNumber() +
                    "\n customer " + s.getHolder().getFirstName() + " " + s.getHolder().getLastName() +
                    "\n Balance :" + s.getBalance() +
                    "\n minimumBalance :" + s.getMinimumBalance());
        } else {
            System.out.println("Account not found.");
        }
    }


    @Override
    public SavingAccount returnAccountNumber(String accNumber) {
        for (SavingAccount account : accountArrayList) {
            if (account.getAccNumber().equals(accNumber))
                return account;
        }
        return null;
    }

    // Input account Number and then print the balance
    // Use correct name for the function
    @Override
    public void printAccountBalance(String accNumber) {
        SavingAccount s = returnAccountNumber(accNumber);

        if (s != null) {
            double balance = s.getBalance();
            System.out.println("Bank balance :" + balance);
        } else {
            System.out.println("Account not found.");
        }
    }


    // Input AccountNumber
    // Use correct name for the function
    @Override
    public void printMinimumBalance(String accountNumber) {
        SavingAccount s = returnAccountNumber(accountNumber);
        double minimumBalance = s.getMinimumBalance();
        System.out.println("Minimum Balance of the account :" + minimumBalance);

    }


    // Balance input?????
    // Return type needs to be fixed.
    // Print the appropriate statements.
    @Override
    public double deposit(double depositAmount, String accNumber) {
        SavingAccount s = returnAccountNumber(accNumber);
        if (s != null) {
            double newBalance = depositAmount + s.getBalance();
            s.setBalance(newBalance);
            return newBalance;
        }
        return s.getBalance();

    }

    // Balance input????
    // Only input account number
    // Minimum balance logic should be implemented
    @Override
    public double withdraw(double withdrawAmount, String accNumber) {
        SavingAccount s = returnAccountNumber(accNumber);
        if (s != null) {
            if ((s.getBalance() - withdrawAmount) >= s.getMinimumBalance()) {
                double newBalance = s.getBalance() - withdrawAmount;
                s.setBalance(newBalance);
                System.out.println("new balance: " + newBalance);
                return newBalance;
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Account not found!");
        }
        return 0;
    }


    // Input two account numbers
    // Minimum Balance check should also be implemented
    @Override
    public void transfer(double transferAmount, String sourceAccountNumber, String destinationAccountNumber) {
        SavingAccount sourceAccount = returnAccountNumber(sourceAccountNumber);
        SavingAccount destinationAccount = returnAccountNumber(destinationAccountNumber);

        if ((sourceAccount.getBalance() - transferAmount) >= sourceAccount.getMinimumBalance()) {
            sourceAccount.setBalance(sourceAccount.getBalance() - transferAmount);
            destinationAccount.setBalance(destinationAccount.getBalance() + transferAmount);
            System.out.println("Transfer Successful!");
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}


