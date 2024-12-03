package com.banking.models.user;

import com.banking.enums.Gender;
import com.banking.models.account.Account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends Person  {
    private Date customerSince;
    public boolean isActive;
    private String panNumber;
    private List<Account> accountList = new ArrayList<>();


    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
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
    }

}
