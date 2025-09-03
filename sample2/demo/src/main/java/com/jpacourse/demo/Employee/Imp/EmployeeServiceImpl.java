package com.jpacourse.demo.Employee.Imp;

import com.jpacourse.demo.Employee.Employee;
import com.jpacourse.demo.Employee.EmployeeRepository;
import com.jpacourse.demo.Employee.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override

    public Employee findEmployeeByUserId(String userid) {

        log.info("inside findbyuserid");
       return  employeeRepository.findByUserId(userid);

    }


}
