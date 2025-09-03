package com.jpacourse.demo.Employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Employee {
    @Id
    @GeneratedValue
    private Long empid;
    private String userId;
    private String firstName;
    private String lastName;
    @Column(name="chair_access")
    private boolean hasChairAccess;
    @Column(name="primary_analyst_access")
    private boolean hasPrimaryAnalystAccess;

    public Employee() {
    }

    public Employee(String userId, String firstName, String lastName, boolean hasChairAccess, boolean hasPrimaryAnalystAccess) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hasChairAccess = hasChairAccess;
        this.hasPrimaryAnalystAccess = hasPrimaryAnalystAccess;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isHasChairAccess() {
        return hasChairAccess;
    }

    public void setHasChairAccess(boolean hasChairAccess) {
        this.hasChairAccess = hasChairAccess;
    }

    public boolean isHasPrimaryAnalystAccess() {
        return hasPrimaryAnalystAccess;
    }

    public void setHasPrimaryAnalystAccess(boolean hasPrimaryAnalystAccess) {
        this.hasPrimaryAnalystAccess = hasPrimaryAnalystAccess;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hasChairAccess=" + hasChairAccess +
                ", hasPrimaryAnalystAccess=" + hasPrimaryAnalystAccess +
                '}';
    }
}
