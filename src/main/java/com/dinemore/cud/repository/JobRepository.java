package com.dinemore.cud.repository;

import com.dinemore.cud.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepository extends JpaRepository<Job,String> {

    Job findJobByname(String name);
}
