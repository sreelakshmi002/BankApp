package com.banking.services.impl;


import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;
import com.banking.services.IAccountService;

public class AccountServiceImpl implements IAccountService {

    @Override
    public SavingAccount savingAccount(String accNumber, Customer holder) {
        SavingAccount savingAccount = new SavingAccount(accNumber, holder);
        return savingAccount;
    }

    @Override
    public void printSavingAccountDetails(SavingAccount savingAccount) {
        System.out.println("Account number:" + savingAccount.getAccNumber() + " \n customer " + savingAccount.getHolder().getFirstName());
    }

    @Override
    public double balance(SavingAccount savingAccount) {
       double balance= savingAccount.getBalance();
        System.out.println("balance "+balance);
        return balance;
    }

    @Override
    public void minimumBalance(SavingAccount savingAccount) {

        savingAccount.getMinimumBalance();
    }



    @Override
    public double deposit(double depositAmount,double balance, SavingAccount savingAccount) {
        if (depositAmount > 0) {
        double  newbalance = depositAmount+savingAccount.getBalance();
        savingAccount.setBalance(newbalance);
            return newbalance;
        }
      else {
            System.out.println("deposit amount should greater than 0");
            return savingAccount.getBalance();
        }
    }

    @Override
    public double withdraw(double withdrawAmount, SavingAccount savingAccount, double balance) {
        if (withdrawAmount > 0 && savingAccount.getBalance() >= withdrawAmount) {
            double newBalance = savingAccount.getBalance() - withdrawAmount;
            savingAccount.setBalance(newBalance);
            System.out.println( "new balance: " + newBalance);
            return newBalance;
        } else if (withdrawAmount <= 0) {
            System.out.println("Withdrawal amount should greater than 0.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
        return savingAccount.getBalance();
    }

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

}

