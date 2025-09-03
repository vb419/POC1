package com.jpacourse.demo.EmployeeRights;

import com.jpacourse.demo.Employee.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class EmployeeRightsServiceImpl implements EmployeeRightsService {
    private static final Logger log = LoggerFactory.getLogger(EmployeeRightsServiceImpl.class);
    EmployeeRightsRepository employeeRightsRepository;

    public EmployeeRightsServiceImpl(EmployeeRightsRepository employeeRightsRepository) {
        this.employeeRightsRepository = employeeRightsRepository;
    }

    @Override
    public List<EmployeeRights> findAll() {
        return employeeRightsRepository.findAll();
    }

    @Override
    public List<EmployeeRights> getEmployeeRightsbyUserId(String userId) {

        return employeeRightsRepository.findByUserId(userId);
    }
}
