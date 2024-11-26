package com.banking.models.user;

import com.banking.enums.Gender;

import java.util.Date;

public abstract class Person {
    protected  String id;
    protected  String firstName;
    protected  String lastName;
    protected  String address;
    protected  String phoneNumber;
    protected Gender gender;
    protected Date dateOfBirth;
    protected String email;

    abstract void printAllDetails();


    public Person(){

    }

  public Person(String id,String firstName,String lastName,String address,String phoneNumber,Gender gender,Date dateOfBirth,String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.email=email;
    }
    public void printFullName(){

        System.out.println(firstName+" "+lastName);
    }
    public String getName(){
        return firstName+ lastName;
    }

}
