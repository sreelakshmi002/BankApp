package com.banking.models.user;

import java.util.Date;

public class Employee extends Person{
   private String department;
   private String designation;
   private Date joiningDate;
   private JobStatus status;
   private int branchId;
   private double salary;

   void Employee(){

   }

   void Employee(String department,String designation,Date joiningDate,JobStatus status,int branchId,double salary){
       this.department=department;
       this.designation=designation;
       this.joiningDate=joiningDate;
       this.status=status;
       this.id=id;
       this.salary=salary;
    }

    void transferBranch(int branchId){
       this.branchId=branchId;
    }
    void updateStatus(JobStatus status){
       this.status=status;
    }
    @Override
    void printAllDetails() {

    }
}
