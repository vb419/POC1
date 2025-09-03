package com.jpacourse.demo.EmployeeRights;


import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeRightsService {
    List<EmployeeRights> findAll();
    List<EmployeeRights> getEmployeeRightsbyUserId(String userId);

}
