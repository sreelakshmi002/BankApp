package com.banking;

import com.banking.enums.Gender;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;
import com.banking.services.impl.SavingAccountServiceImpl;
import com.banking.services.impl.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.Date;

public class BankApplication {


    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static SavingAccountServiceImpl savingAccountService = new SavingAccountServiceImpl();


    public static void main(String[] args) {




        Customer customer1 = customerService.createCustomer("ABVG897", "Sreelakshmi",
                "Shaji", "Kalathil", "903654123",
                Gender.FEMALE, new Date(), "sree@gmail.com",
                "ASDF123");

        Customer customer2 = customerService.createCustomer("ABVG8257", "Athul",
                "Biju", "Kalathil", "903654122",
                Gender.MALE, new Date(), "athul@gmail.com",
                "ASDF123");

        System.out.println("Customers created:");
        customerService.printCustomerDetails("903654123");
//        customerService.printCustomerDetails("903654122");

        SavingAccount account1 = savingAccountService.createSavingAccount("ADFR1233",
                "903654123");

        System.out.println("Accounts created:");
        savingAccountService.printSavingAccountDetails("ADFR1233");

//        customerService.printCustomerDetails("903654123");



    }
}

