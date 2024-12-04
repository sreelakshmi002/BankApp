package com.banking;

import com.banking.enums.Gender;
import com.banking.enums.JobStatus;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;
import com.banking.models.user.Employee;
import com.banking.services.impl.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.Date;

public class BankApplication {


    static ArrayList<Customer> customerArrayList = new ArrayList<>();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();

    public static void main(String[] args) {


        Customer createdCustomer = customerService.createCustomer("ABVG897", "Sreelakshmi",
                "Shaji","Kalathil", "903654123",
                Gender.FEMALE, new Date(), "sree@gmail.com",
                "ASDF123", customerArrayList);


//    customerArrayList.add(createdCustomer);
//    for(Customer c:customerArrayList){
//      customerService.printDetails(c);
//    customerService.updatePhoneNumber("9064521398",createdCustomer);
//    customerService.printPhoneNumber(createdCustomer);
//    customerService.printAddress(createdCustomer);
        Customer createdCustomer1 = customerService.createCustomer("ABVG897", "Athul",
                "Biju","Kalathil", "903654123",
                Gender.FEMALE, new Date(), "sree@gmail.com",
                "ASDF123", customerArrayList);

        for (Customer customer : customerArrayList) {
            customerService.printDetails(customer);
            System.out.println("______________________");
        }
    }
}

