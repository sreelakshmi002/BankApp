package com.banking;

import com.banking.enums.Gender;
import com.banking.enums.JobStatus;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;
import com.banking.models.user.Employee;
import com.banking.services.impl.CustomerServiceImpl;

import java.util.Date;

public class BankApplication {
  public static void main(String[] args) {

    CustomerServiceImpl customerService=new CustomerServiceImpl();

    Customer createdCustomer=customerService.createCustomer("ABVG897","Sreelakshmi","Shaji"
            ,"Kalathil","903654123",
            Gender.FEMALE,new Date(),"sree@gmail.com","ASDF123");

    customerService.printDetails(createdCustomer);
    customerService.updatePhoneNumber("9064521398",createdCustomer);
    customerService.printPhoneNumber(createdCustomer);
    customerService.printAddress(createdCustomer);


  }
}
