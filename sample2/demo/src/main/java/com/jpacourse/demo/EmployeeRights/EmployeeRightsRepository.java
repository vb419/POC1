package com.jpacourse.demo.EmployeeRights;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRightsRepository extends JpaRepository<EmployeeRights, Long> {

     List<EmployeeRights> findByUserId(String str);


}
