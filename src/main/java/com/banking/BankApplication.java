package com.banking;

import com.banking.enums.Gender;
import com.banking.enums.JobStatus;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;
import com.banking.models.user.Employee;
import com.banking.services.impl.AccountServiceImpl;
import com.banking.services.impl.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.Date;

public class BankApplication {


    static ArrayList<Customer> customerArrayList = new ArrayList<>();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static AccountServiceImpl accountService=new AccountServiceImpl();
    static ArrayList<SavingAccount> accountArrayList=new ArrayList<>();

    public static void main(String[] args) {


        Customer createdCustomer = customerService.createCustomer("ABVG897", "Sreelakshmi",
                "Shaji", "Kalathil", "903654123",
                Gender.FEMALE, new Date(), "sree@gmail.com",
                "ASDF123", customerArrayList,accountArrayList);
        Customer createdCustomer1 = customerService.createCustomer("ABVG8257", "Athul",
                "Biju","Kalathil", "903654122",
                Gender.MALE, new Date(), "athul@gmail.com",
                "ASDF123", customerArrayList,accountArrayList);

 
        SavingAccount accDetails = accountService.createdSavingAccount("ADFR1233", createdCustomer);
        SavingAccount accDetails1 = accountService.createdSavingAccount("ADFR1238", createdCustomer1);

        customerService.addAccountToCustomer(createdCustomer, accDetails);
        customerService.addAccountToCustomer(createdCustomer1,accDetails1);
        System.out.println("Account details.................");



        accountService.printSavingAccountDetails(accDetails);
        accountService.deposit(1000, accDetails.getBalance(), accDetails);
        System.out.println("balance after depositing: "+accDetails.getBalance());
        accountService.withdraw(500,accDetails, accDetails.getBalance());
        accountService.transfer(1000,accDetails,accDetails1);
        System.out.println("Balance :"+accountService.balance(accDetails));




        System.out.println("....................");



//    customerArrayList.add(createdCustomer);
//    for(Customer c:customerArrayList){
//      customerService.printDetails(c);
//    customerService.updatePhoneNumber("9064521398",createdCustomer);
//    customerService.printPhoneNumber(createdCustomer);
//    customerService.printAddress(createdCustomer);


        for (Customer customer : customerArrayList) {
            customerService.printDetails(customer);
            System.out.println("______________________");
        }
            customerService.updateCustomer("903654123","mini","shaji",
                    "Zen","Mini@123",customerArrayList);


        System.out.println("after updating......");

        customerService.getCustomer(customerArrayList,"903654123");
        customerService.getUpdatedCustomer( customerArrayList,"903654123");
        System.out.println();

        customerService.removeCustomer(customerArrayList,"903654121");

        System.out.println("printing details after removing.....");
        System.out.println();
        for (Customer customer : customerArrayList) {
            customerService.printDetails(customer);
            System.out.println("______________________");
        }


    }
}

