package com.banking.services.impl;


import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;
import com.banking.services.ISavingAccountService;

import java.util.ArrayList;

public class SavingAccountServiceImpl implements ISavingAccountService {
    static ArrayList<SavingAccount> accountArrayList = new ArrayList<>();

    // Incorrect :
    // Should input only customer mobile number and find the customer from that input
    // Add the created account to AccountList of customer also
    @Override
    public SavingAccount createSavingAccount(String accNumber, Customer holder) {


        SavingAccount createdSavingAccount = new SavingAccount(accNumber, holder);

        accountArrayList.add(createdSavingAccount);
        return createdSavingAccount;
    }


    // Input account Number and then print the balance
    // Use correct name for the function
    @Override
    public double balance(SavingAccount createdSavingAccount) {
        double balance = createdSavingAccount.getBalance();
        System.out.println("balance " + balance);
        return balance;
    }

    // Input AccountNumber
    // Use correct name for the function
    @Override
    public void minimumBalance(String accountNumber) {



    }


    // Balance input?????
    // Return type needs to be fixed.
    // Print the appropriate statements.
    @Override
    public double deposit(double depositAmount, double balance, SavingAccount createdSavingAccount) {
        if (depositAmount > 0) {
            double newBalance = depositAmount + createdSavingAccount.getBalance();
            createdSavingAccount.setBalance(newBalance);
            return newBalance;
        } else {
            System.out.println("deposit amount should greater than 0");
            return createdSavingAccount.getBalance();
        }
    }

    // Balance input????
    // Only input account number
    // Minimum balance logic should be implemented
    @Override
    public double withdraw(double withdrawAmount, SavingAccount createdSavingAccount, double balance) {
        if (withdrawAmount > 0 && createdSavingAccount.getBalance() >= withdrawAmount) {
            double newBalance = createdSavingAccount.getBalance() - withdrawAmount;
            createdSavingAccount.setBalance(newBalance);
            System.out.println("new balance: " + newBalance);
            return newBalance;
        } else if (withdrawAmount <= 0) {
            System.out.println("Withdrawal amount should greater than 0.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
        return createdSavingAccount.getBalance();
    }

    // Input two account numbers
    // Minimum Balance check should also be implemented
    @Override
    public void transfer(double transferAmount, SavingAccount sourceAccount, SavingAccount destinationAccount) {
        if (transferAmount > 0 && sourceAccount.getBalance() >= transferAmount) {
            sourceAccount.setBalance(sourceAccount.getBalance() - transferAmount);
            destinationAccount.setBalance(destinationAccount.getBalance() + transferAmount);
            System.out.println("Transfer Successful!");
        } else if (transferAmount <= 0) {
            System.out.println("Transfer amount must be greater than 0.");
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }

    @Override
    public void printSavingAccountDetails(SavingAccount createdSavingAccount) {
        System.out.println("\n Account number:" + createdSavingAccount.getAccNumber() +
                "\n customer " + createdSavingAccount.getHolder().getFirstName() + " " + createdSavingAccount.getHolder().getLastName() +
                "\n Balance :" + createdSavingAccount.getBalance() +
                "\n minimumBalance :" + createdSavingAccount.getMinimumBalance());
    }
}


