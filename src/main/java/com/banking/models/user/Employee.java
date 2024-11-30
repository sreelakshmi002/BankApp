package com.banking.models.user;

import com.banking.enums.Gender;
import com.banking.enums.JobStatus;

import java.util.Date;

public class Employee extends Person {
    private String department;
    private String designation;
    private Date joiningDate;
    private JobStatus status;
    private int branchId;
    private double salary;

    public Employee() {

    }

    public Employee(String id, String firstName, String lastName, String address, String phoneNumber, Gender gender, Date dateOfBirth, String email, String department, String designation, Date joiningDate, JobStatus status, int branchId, double salary) {
        super(id, firstName, lastName, address, phoneNumber, gender, dateOfBirth, email);
        this.department = department;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.status = status;
        this.branchId = branchId;
        this.salary = salary;
    }

    public void transferBranch(int branchId) {
        System.out.println("After tansfering bank.....");
        this.branchId = branchId;
    }

    public void printBranch() {
        System.out.println(branchId);
    }

    public void updateStatus(JobStatus status) {

        this.status = status;
    }

    @Override
    public void printAllDetails() {
        System.out.println("customer id :" + id);
        System.out.println("FirstName :" + firstName);
        System.out.println("LastName :" + lastName);
        System.out.println("Address :" + address);
        System.out.println("PhoneNumber :" + phoneNumber);
        System.out.println("Gender :" + gender);
        System.out.println("DateOfBirth :" + dateOfBirth);
        System.out.println("Email id : " + email);
        System.out.println("Department : " + department);
        System.out.println("Designation : " + designation);
        System.out.println("JoiningDate : " + joiningDate);
        System.out.println("Status : " + status);
        System.out.println("BranchId : " + branchId);
        System.out.println("Salary : " + salary);

    }
}
