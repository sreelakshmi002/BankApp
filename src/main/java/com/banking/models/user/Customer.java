package com.banking.models.user;

import com.banking.enums.Gender;

import java.util.Date;

public class Customer extends Person{
   private Date customerSince;
   private boolean isActive;

   private String panNumber;


   public Customer(){
   }
   public Customer(String id, String firstName, String lastName, String address,
                   String phoneNumber, Gender gender, Date dateOfBirth, String email,Date customerSince, boolean isActive, String panNumber){
       super(id,firstName,lastName,address,phoneNumber,gender,dateOfBirth,email);
       this.customerSince=customerSince;
       this.isActive=true;
       this.panNumber=panNumber;
   }
   @Override
    public void printAllDetails() {
       System.out.println("customer id :"+id);
       System.out.println("FirstName :"+firstName);
       System.out.println("LastName :"+lastName);
       System.out.println("Address :"+address);
       System.out.println("PhoneNumber :"+phoneNumber);
       System.out.println("Gender :"+gender);
       System.out.println("DateOfBirth :"+dateOfBirth);
       System.out.println("Email id : "+email);
       System.out.println("CustomerSince : "+customerSince);
       System.out.println("isActive=true:");
       System.out.println("PanNumber : "+panNumber);


    }
}
