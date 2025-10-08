package com.jpacourse.demo.Employee;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@Tag(name = "Employee Access Verification", description = "APIs to Verify users Access")

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


//    @GetMapping("/Employee")
//    public ResponseEntity<List<Employee>> findAll() {
//        return ResponseEntity.ok(employeeService.findAll());
//    }

    @Operation(summary = "Get Employee by ID", description = "Retrieve a Employee's access using their ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User found",
                    content = @Content(schema = @Schema(implementation = Employee.class))),
            @ApiResponse(responseCode = "404", description = "User not found",
                    content = @Content(schema = @Schema()))
    })
    @CrossOrigin(origins = "*")
    @GetMapping("/Employee/Byuserid/{userid}")
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
