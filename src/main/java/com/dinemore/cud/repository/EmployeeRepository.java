package com.dinemore.cud.repository;

import com.dinemore.cud.dto.Employeedto;
import com.dinemore.cud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

   // Employee find_By_EmployeeName(String name);

}
