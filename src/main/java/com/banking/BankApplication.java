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



        Customer createdCustomer = customerService.createCustomer("ABVG897", "Sreelakshmi",
                "Shaji", "Kalathil", "903654123",
                Gender.FEMALE, new Date(), "sree@gmail.com",
                "ASDF123");

        Customer createdCustomer1 = customerService.createCustomer("ABVG8257", "Athul",
                "Biju", "Kalathil", "903654122",
                Gender.MALE, new Date(), "athul@gmail.com",
                "ASDF123");

        customerService.printDetails(createdCustomer);


        SavingAccount accDetails = savingAccountService.createSavingAccount("ADFR1233",
                createdCustomer);
        SavingAccount accDetails1 = savingAccountService.createSavingAccount("ADFR1238",
                createdCustomer1);
        savingAccountService.printSavingAccountDetails(accDetails);

//       customerService.addAccountToCustomer(createdCustomer, accDetails);
//        customerService.addAccountToCustomer(createdCustomer1,accDetails1);
//        System.out.println("Account details.................");
//
//
//
//        savingAccountService.printSavingAccountDetails(accDetails);
//        savingAccountService.deposit(1000, accDetails.getBalance(), accDetails);
//        System.out.println("balance after depositing: "+accDetails.getBalance());
//        savingAccountService.withdraw(500,accDetails, accDetails.getBalance());
//        savingAccountService.transfer(1000,accDetails,accDetails1);
//        System.out.println("Balance :"+savingAccountService.balance(accDetails));
//
//
//
//
//        System.out.println("....................");
//
//
//
////    customerArrayList.add(createdCustomer);
////    for(Customer c:customerArrayList){
////      customerService.printDetails(c);
////    customerService.updatePhoneNumber("9064521398",createdCustomer);
////    customerService.printPhoneNumber(createdCustomer);
////    customerService.printAddress(createdCustomer);
//
//
//
//            customerService.updateCustomer("903654123","mini","shaji",
//                    "Zen","Mini@123");
//
//
//        System.out.println("after updating......");
//
//        customerService.getCustomer("903654123");
//
//        System.out.println();
//
//        customerService.removeCustomer("903654121");
//
//        System.out.println("printing details after removing.....");
//        System.out.println();
//
//

    }
}

