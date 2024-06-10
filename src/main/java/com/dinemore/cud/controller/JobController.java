package com.dinemore.cud.controller;

import com.dinemore.cud.dto.Employeedto;
import com.dinemore.cud.dto.Jobdto;
import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.entity.Job;
import com.dinemore.cud.entity.Salary;
import com.dinemore.cud.service.impl.EmployeeServiceimpl;
import com.dinemore.cud.service.impl.JobServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/job")
public class JobController {

    @Autowired
    private JobServiceimpl jobServiceimpl112;


    @PostMapping("/save")
    public Job saveJob(@RequestBody Jobdto jobdto){

        return jobServiceimpl112.savejob(jobdto);
    }

    @GetMapping("/get")
    public List<Jobdto>getallJobs(){

        return jobServiceimpl112.gettAllJob();
    }
    @GetMapping("/find/{name}")
    public ResponseDTO findJobbyname(@PathVariable Salary name){

        return jobServiceimpl112.getJobByname(String.valueOf(name));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseDTO deletejobbyID(@PathVariable String id){
        return jobServiceimpl112.deletejob(id);
    }

}
