package com.dinemore.cud.repository;

import com.dinemore.cud.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SalaryRepository extends JpaRepository<Salary,String> {
}
