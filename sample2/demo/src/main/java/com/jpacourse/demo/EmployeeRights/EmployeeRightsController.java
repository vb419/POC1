package com.jpacourse.demo.EmployeeRights;


import com.jpacourse.demo.Employee.Employee;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@Tag(name = "Employee Rights Verification", description = "APIs to Verify Employee Rights")
public class EmployeeRightsController {
    EmployeeRightsService employeeRightsService;

    public EmployeeRightsController(EmployeeRightsService employeeRightsService) {
        this.employeeRightsService = employeeRightsService;
    }

//    @GetMapping("EmployeeRights/all")
//    public List<EmployeeRights> getAllEmployeeRights(){
//        return employeeRightsService.findAll();
//    }

    @Operation(summary = "Get Employee Rights by ID", description = "Get Employee Rights using their ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User found",
                    content = @Content(schema = @Schema(implementation = EmployeeRights.class))),
            @ApiResponse(responseCode = "404", description = "User not found",
                    content = @Content(schema = @Schema()))
    })

    @CrossOrigin(origins = "*")

    @GetMapping("EmployeeRights/Byuserid/{userId}")
    public ResponseEntity<List<EmployeeRights>> getEmployeeRightsByUserId(@PathVariable("userId")  String userId) {

        List<EmployeeRights> employeeRights = employeeRightsService.getEmployeeRightsbyUserId(userId);
        if(!employeeRights.isEmpty()) {
            return ResponseEntity.ok(employeeRights);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Rights found for the given user id");
        }
    }
}
