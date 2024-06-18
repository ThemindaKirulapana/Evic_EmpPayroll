package com.dinemore.cud.repository;

import com.dinemore.cud.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepository extends JpaRepository<Job,String> {

    @Query("SELECT j from Job j where j.name=?1")
    Job findJobByname(String name);
}
