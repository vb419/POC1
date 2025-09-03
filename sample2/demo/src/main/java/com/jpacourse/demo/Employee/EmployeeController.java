package com.jpacourse.demo.Employee;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/Employee")
    public ResponseEntity<List<Employee>> findAll() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @GetMapping("/Employee/userid/{userid}")
    public ResponseEntity<Employee> findEmployeeByUserId(@PathVariable String userid){
        //return ResponseEntity.ok(employeeService.findEmployeeByUserId(userid))  ;
        Employee EmployeeList = employeeService.findEmployeeByUserId(userid);
        if(EmployeeList != null){
            return ResponseEntity.ok(EmployeeList);
        } else {
            //throw new RuntimeException("No User Found with given user id ");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Employee found for the given user id");

        }
    }





}
