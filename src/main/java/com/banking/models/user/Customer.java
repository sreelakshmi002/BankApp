package com.banking.models.user;

import com.banking.enums.Gender;
import com.banking.models.account.Account;
import com.banking.models.account.SavingAccount;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends Person  {
    private Date customerSince;
    public boolean isActive;
    private String panNumber;
    private List<SavingAccount> accountList = new ArrayList<>();


    public List<SavingAccount> getAccountList() {

        return accountList;
    }

    public void setAccountList(List<SavingAccount> accountList) {

        this.accountList = accountList;
    }

    public void addAccount(SavingAccount account) {
        this.accountList.add(account);
    }

    public Date getCustomerSince() {

        return customerSince;
    }

    public void setCustomerSince(Date customerSince) {
        this.customerSince = customerSince;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public Customer() {
    }

    public Customer(String id, String firstName, String lastName, String address,
                    String phoneNumber, Gender gender, Date dateOfBirth, String email,  String panNumber) {
        super(id, firstName, lastName, address, phoneNumber, gender, dateOfBirth, email);

        this.customerSince = new Date();
        this.isActive = true;
        this.panNumber = panNumber;
        this.accountList=new ArrayList();
    }

}
