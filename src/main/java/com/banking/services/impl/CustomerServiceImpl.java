package com.banking.services.impl;

import com.banking.enums.Gender;
import com.banking.models.user.Customer;
import com.banking.services.ICustomerService;

import java.util.Date;

public class CustomerServiceImpl implements ICustomerService {
    @Override
    public Customer createCustomer(String id, String firstName, String lastName, String address, String phoneNumber, Gender gender, Date dateOfBirth, String email, String panNumber) {
        Customer customer=new Customer(id,firstName,lastName,address,phoneNumber,gender,dateOfBirth,email,panNumber);
        return customer;
    }

    @Override
    public void updatePhoneNumber(String phoneNumber,Customer customer) {
            customer.setPhoneNumber(phoneNumber);
    }



    @Override
    public void printPhoneNumber(Customer customer) {
        System.out.println(customer.getPhoneNumber());
    }

    @Override
    public void printDetails(Customer customer) {
        System.out.println("id :"+customer.getId()+"\n name :"+customer.getFirstName()+customer.getLastName()+ "\n Address :"
                + customer.getAddress()+" \n phonenumber: " + customer.getPhoneNumber()+
                " \n Gender: " +customer.getGender()+" \n DOB: "+customer.getDateOfBirth()+" \n Email: "+customer.getEmail()+
                "\n PanNumber: "+customer.getPanNumber());
    }



    @Override
    public void updateAddress(Customer customer, String address) {
        customer.setAddress(address);
    }

    @Override
    public void printAddress(Customer customer) {
        System.out.println(customer.getAddress());
    }
}
