package com.banking.services.impl;

import com.banking.enums.Gender;
import com.banking.models.user.Customer;
import com.banking.services.ICustomerService;

import java.util.ArrayList;
import java.util.Date;

public class CustomerServiceImpl implements ICustomerService {
    @Override
    public Customer createCustomer(String id, String firstName, String lastName, String address,
                                   String phoneNumber, Gender gender, Date dateOfBirth, String email,
                                   String panNumber, ArrayList<Customer> customerArrayList) {
        for (Customer c : customerArrayList) {

            if (c.getPhoneNumber().equals(phoneNumber)) {
                return null;

            }
        }

        Customer customer = new Customer(id, firstName, lastName, address, phoneNumber, gender,
                dateOfBirth, email, panNumber);
        customerArrayList.add(customer);
        return customer;

    }

    @Override
    public void updatePhoneNumber(String phoneNumber, Customer customer) {
        customer.setPhoneNumber(phoneNumber);
    }


    @Override
    public void printPhoneNumber(Customer customer) {
        System.out.println(customer.getPhoneNumber());
    }

    @Override
    public void printDetails(Customer customer) {
        System.out.println("id :" + customer.getId() + "\n name :" + customer.getFirstName() + customer.getLastName() + "\n Address :"
                + customer.getAddress() + " \n phoneNumber: " + customer.getPhoneNumber() +
                " \n Gender: " + customer.getGender() + " \n DOB: " + customer.getDateOfBirth() + " \n Email: " + customer.getEmail() +
                "\n PanNumber: " + customer.getPanNumber());
    }


    @Override
    public void updateAddress(Customer customer, String address) {
        customer.setAddress(address);
    }

    @Override
    public void printAddress(Customer customer) {
        System.out.println(customer.getAddress());
    }




    public Customer getCustomer(ArrayList<Customer> customerArrayList, String phoneNumber) {

        for (Customer c : customerArrayList) {

            if (c.getPhoneNumber().equals(phoneNumber)) {
                return c;

            }
        }
        return null;

    }

    @Override
    public void removeCustomer( ArrayList<Customer> customerArrayList,String phoneNumber) {

        for (Customer c:customerArrayList){
            if (c.getPhoneNumber().equals(phoneNumber)){
               customerArrayList.remove(c);
                System.out.println("customer removed successfully");
            }
        }


    }

    public void updateCustomer(Customer customer, String id, String firstName,
                               String lastName, String phoneNumber,
                               String address, String email, ArrayList<Customer> customerArrayList) {

        Customer c = getCustomer(customerArrayList, phoneNumber);
        if (c == null) {
            System.out.println("customer is not-existing.......");
            return;
        }
            customer.setId(id);
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setPhoneNumber(phoneNumber);
            customer.setAddress(address);
            customer.setEmail(email);
            System.out.println("customer updated successfully.....");



    }

    @Override
    public void getUpdatedCustomer(Customer customer) {

        System.out.println(customer.getId());
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getAddress());
        System.out.println(customer.getEmail());
    }
}
