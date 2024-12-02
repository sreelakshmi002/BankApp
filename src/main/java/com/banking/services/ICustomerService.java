package com.banking.services;

import com.banking.enums.Gender;
import com.banking.models.user.Customer;

import java.util.Date;

public interface ICustomerService {

    Customer createCustomer(String id, String firstName, String lastName, String address,
                            String phoneNumber, Gender gender, Date dateOfBirth, String email, String panNumber);



    public void updatePhoneNumber(String phoneNumber,Customer customer);
    public void printPhoneNumber(Customer customer);
    public void printDetails(Customer customer);
    public void updateAddress(Customer customer,String address);
    public void printAddress(Customer customer);
}
