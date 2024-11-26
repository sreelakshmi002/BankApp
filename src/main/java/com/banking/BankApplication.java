package com.banking;

import com.banking.enums.Gender;
import com.banking.enums.JobStatus;
import com.banking.models.user.Customer;
import com.banking.models.user.Employee;

import java.util.Date;

public class BankApplication {
    public static void main(String[] args){
      Customer c1=new Customer("1234","Sreelakshmi","Shaji","Address","9623536545", Gender.Female, new Date(),"sree@gmail.com",new Date(),true,"0987");
            c1.printAllDetails();
       Employee e1=new Employee("0657","Athul","B","Address","9031263696",Gender.Male,new Date(),"athul@gmail.com","Associate","employee",new Date(),JobStatus.Onjob,236,25536);
      e1.printAllDetails();
      e1.transferBranch(896);
      e1.printBranch();
    }

}
