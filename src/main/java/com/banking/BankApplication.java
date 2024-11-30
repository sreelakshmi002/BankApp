package com.banking;

import com.banking.enums.Gender;
import com.banking.enums.JobStatus;
import com.banking.models.account.SavingAccount;
import com.banking.models.user.Customer;
import com.banking.models.user.Employee;

import java.util.Date;

public class BankApplication {
    public static void main(String[] args){
      Customer c1=new Customer("1234","Sreelakshmi","Shaji","Address","9623536545", Gender.FEMALE, new Date(),"sree@gmail.com",new Date(),true,"0987");
        Customer c2=new Customer("1234","Sreelakshmi","Shaji","Address","9623536545", Gender.FEMALE, new Date(),"sree@gmail.com",new Date(),true,"0987");
//            c1.printAllDetails();
//       Employee e1=new Employee("0657","Athul","B","Address","9031263696",Gender.MALE,new Date(),"athul@gmail.com","Associate","employee",new Date(),JobStatus.ONJOB,236,25536);
//      e1.printAllDetails();
//      e1.transferBranch(896);
//      e1.printBranch();


//        System.out.println( s1.getDetails());
//
//        SavingAccount s2=new SavingAccount("ABCD1287",c1);
//        System.out.println( s2.getDetails());

        SavingAccount s1=new SavingAccount("ABCD1234",c1);
        SavingAccount s2=new SavingAccount("ABCD1267",c1);

        c1.printAccount();
//        s1.withdraw(1000,c1);
        s1.deposit(10000,"ABCD1234");
        s1.transferMoney(s1,s2,500);
        s1.getBalance();
        s2.getBalance();
    }

}
