package com.jpacourse.demo.Employee;


import com.jpacourse.demo.EmployeeRights.EmployeeRights;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findEmployeeByUserId(String userid);


}
