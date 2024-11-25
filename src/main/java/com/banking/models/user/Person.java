package com.banking.models.user;

import java.util.Date;

public abstract class Person {
    protected  String id;
    protected  String firstName;
    protected  String lastName;
    protected  String address;
    protected  int phoneNumber;
    protected  Gender gender;
    protected Date dateOfBirth;
    protected String email;

    abstract void printAllDetails();


    void Person(){

    }

    void Person(String id,String firstName,String lastName,String address,int phoneNumber,Gender gender,Date dateOfBirth,String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.email=email;
    }
    void printFullName(String firstName,String lastName){
        System.out.println(firstName+" "+lastName);
    }

}
