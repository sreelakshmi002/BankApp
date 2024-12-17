package com.banking.services.impl;

import com.banking.enums.Gender;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;
import com.banking.services.ICustomerService;

import java.util.ArrayList;
import java.util.Date;

public class CustomerServiceImpl implements ICustomerService {
    static ArrayList<Customer> customerArrayList = new ArrayList<>();

    @Override
    public Customer createCustomer(String id, String firstName, String lastName, String address,
                                   String phoneNumber, Gender gender, Date dateOfBirth, String email,
                                   String panNumber ) {

        if (getCustomer(phoneNumber) != null) {
            System.out.println("Customer with this phone Number is already existed!");
            return null;
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

        System.out.println("CustomerPhoneNumber :" + customer.getPhoneNumber());
    }

    @Override
    public void printDetails(Customer customer) {

        System.out.println("\n id :" + customer.getId() +
                           "\n name :" + customer.getFirstName() + customer.getLastName() +
                           "\n Address :" + customer.getAddress() +
                           "\n phoneNumber: " + customer.getPhoneNumber() +
                           "\n Gender: " + customer.getGender() +
                           "\n DOB: " + customer.getDateOfBirth() +
                           "\n Email: " + customer.getEmail() +
                           "\n PanNumber: " + customer.getPanNumber());

            for (SavingAccount account:customer.getAccountList()){
                System.out.println("Account Number: " + account.getAccNumber());
                System.out.println("Balance: " + account.getBalance());
                System.out.println("Minimum Balance: " + account.getMinimumBalance());
             
        }
    }

    @Override
    public void updateAddress(Customer customer, String address) {
        customer.setAddress(address);
    }

    @Override
    public void printAddress(Customer customer) {
        System.out.println("Address of the customer :" + customer.getAddress());
    }

    public Customer getCustomer(String phoneNumber) {

        for (Customer c : customerArrayList) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void removeCustomer(String phoneNumber) {
        Customer c = getCustomer(phoneNumber);

        if (c!=null) {
            customerArrayList.remove(c);
            System.out.println("Customer removed successfully");
        } else {
            System.out.println("Customer with same phoneNumber doesn't exists..");
        }

    }

    public void updateCustomer(String phoneNumber, String firstName,
                               String lastName,
                               String address, String email) {
        Customer c = getCustomer(phoneNumber);
        if (c == null) {
            System.out.println("customer is not-existing.......");
            return;
        }

        c.setFirstName(firstName);
        c.setLastName(lastName);
        c.setAddress(address);
        c.setEmail(email);
        System.out.println("customer updated successfully.....");
    }

    @Override
    public void addAccountToCustomer(Customer customer, SavingAccount account) {
        customer.addAccount(account);
        System.out.println("Account added successfully");
    }

}
