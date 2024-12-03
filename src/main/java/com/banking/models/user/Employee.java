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
}
