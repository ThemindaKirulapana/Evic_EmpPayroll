package com.dinemore.cud.repository;

import com.dinemore.cud.entity.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LeaveRepository extends JpaRepository<Leave,String> {


}
