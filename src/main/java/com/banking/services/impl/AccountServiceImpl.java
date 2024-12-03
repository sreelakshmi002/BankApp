package com.banking.services.impl;

import com.banking.models.account.Account;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;
import com.banking.services.IAccountService;

public class AccountServiceImpl implements IAccountService {
    @Override
    public SavingAccount createSavingAccount(String accNumber, Customer holder, double minimumBalance, double interestRate) {
        SavingAccount account=new SavingAccount(accNumber,holder);
        return account;
    }
}
