package com.banking.services;

import com.banking.enums.Gender;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;

import java.util.ArrayList;
import java.util.Date;

public interface ICustomerService {

    Customer createCustomer(String id, String firstName, String lastName, String address,
                            String phoneNumber, Gender gender, Date dateOfBirth, String email,
                            String panNumber);




    public void printCustomerDetails(String phoneNumber);
    public void printAccountDetails(String phoneNumber);
    public void updateCustomer(String firstName, String lastName,String phoneNumber,
                               String address, String email);
    public Customer getCustomer(String phoneNumber);
    public void removeCustomer( String phoneNumber);



}
