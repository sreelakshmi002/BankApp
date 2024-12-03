package com.banking.services;

import com.banking.models.account.Account;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;

public interface IAccountService {

    SavingAccount createSavingAccount(String accNumber, Customer holder, double minimumBalance,
                                double interestRate);
}
