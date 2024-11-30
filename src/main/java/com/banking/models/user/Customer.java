package com.banking.models.user;

import com.banking.enums.Gender;
import com.banking.models.account.Account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends Person {
    private Date customerSince;
    public boolean isActive;
    private String panNumber;
    private List<Account> accountList = new ArrayList<>();


    public Customer() {
    }

    public Customer(String id, String firstName, String lastName, String address,
                    String phoneNumber, Gender gender, Date dateOfBirth, String email, Date customerSince, boolean isActive, String panNumber) {
        super(id, firstName, lastName, address, phoneNumber, gender, dateOfBirth, email);
        this.customerSince = customerSince;
        this.isActive = true;
        this.panNumber = panNumber;
    }

    public void addAccList(Account account) {
        accountList.add(account);
    }

    @Override
    public void printAllDetails() {
        System.out.println("customer id :" + id);
        System.out.println("FirstName :" + firstName);
        System.out.println("LastName :" + lastName);
        System.out.println("Address :" + address);
        System.out.println("PhoneNumber :" + phoneNumber);
        System.out.println("Gender :" + gender);
        System.out.println("DateOfBirth :" + dateOfBirth);
        System.out.println("Email id : " + email);
        System.out.println("CustomerSince : " + customerSince);
        System.out.println("isActive=true:");
        System.out.println("PanNumber : " + panNumber);


    }

    public void printAccount() {
        for (Account acc : accountList) {
            System.out.println(acc.getAccNumber());
        }
    }
}
