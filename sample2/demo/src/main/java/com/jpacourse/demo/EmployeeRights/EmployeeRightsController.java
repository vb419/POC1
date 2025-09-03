package com.jpacourse.demo.EmployeeRights;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class EmployeeRightsController {
    EmployeeRightsService employeeRightsService;

    public EmployeeRightsController(EmployeeRightsService employeeRightsService) {
        this.employeeRightsService = employeeRightsService;
    }

    @GetMapping("EmployeeRights/all")
    public List<EmployeeRights> getAllEmployeeRights(){
        return employeeRightsService.findAll();
    }

    @GetMapping("EmployeeRights/userid/{userId}")
    public ResponseEntity<List<EmployeeRights>> getEmployeeRightsByUserId(@PathVariable("userId") String userId) {
        //return ResponseEntity.ok(employeeRightsService.getEmployeeRightsbyUserId(userId));
        List<EmployeeRights> employeeRights = employeeRightsService.getEmployeeRightsbyUserId(userId);
        if(!employeeRights.isEmpty()) {
            //System.out.println("entered happy path");
            return ResponseEntity.ok(employeeRights);
        } else {
            //System.out.println("entered exception");
            //throw new RuntimeException("No Rights found for the given user id ");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Rights found for the given user id");
        }
    }
}
