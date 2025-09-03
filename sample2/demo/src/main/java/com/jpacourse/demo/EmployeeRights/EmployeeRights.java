package com.jpacourse.demo.EmployeeRights;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EmployeeRights {
    @Id
    @GeneratedValue
    private Long serialNumber;
    private String userId;
    private String firstName;
    private String lastName;
    private String region;
    private String department;
    private String subDepartment;

    public EmployeeRights() {
    }

    public EmployeeRights(Long serialNumber, String userId, String firstName, String lastName, String region, String department, String subDepartment) {
        this.serialNumber = serialNumber;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.region = region;
        this.department = department;
        this.subDepartment = subDepartment;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSubDepartment() {
        return subDepartment;
    }

    public void setSubDepartment(String subDepartment) {
        this.subDepartment = subDepartment;
    }
}
