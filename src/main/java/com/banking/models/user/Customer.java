package com.banking.models.user;

public class Customer extends Person{
   private String customerSince;
   private boolean isActive;

   private String panNumber;


   void Customer(){

   }
   void Customer(String customerSince,boolean isActive,String panNumber){
       this.customerSince=customerSince;
       this.isActive=true;
       this.panNumber=panNumber;
   }
   @Override
    void printAllDetails() {

    }
}
