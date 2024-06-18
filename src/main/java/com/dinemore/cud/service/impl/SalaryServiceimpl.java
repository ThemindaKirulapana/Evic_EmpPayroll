package com.dinemore.cud.service.impl;

import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.dto.Salarydto;
import com.dinemore.cud.entity.Job;
import com.dinemore.cud.entity.Salary;
import com.dinemore.cud.repository.JobRepository;
import com.dinemore.cud.repository.SalaryRepository;
import com.dinemore.cud.service.SalaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SalaryServiceimpl implements SalaryService {
    @Autowired
    private SalaryRepository salaryRepository2;
    @Autowired
    private JobRepository jobRepository;
    @Override
    public ResponseDTO saveSalary(Salarydto salarydto1) {
        ResponseDTO responseDTO=new ResponseDTO();
        try {
            Salary sal=new Salary();
            String salId = salarydto1.getSalId();
            if (salId == null || salId.trim().isEmpty()) {
                throw new RuntimeException("Salary ID cannot be null or empty");
            }
            String salIdTrimmed = salarydto1.getSalId().trim(); // Trim any leading/trailing spaces
            sal.setSalId(salIdTrimmed);
            // sal.setSalId(salarydto1.getSalId());

            Job job =jobRepository.findJobByname(salarydto1.getJob_name());
            sal.setJob(job);
            if(job==null){
                throw new RuntimeException("Job with id"+salarydto1.getJob_name()+"Not Found");
            }
            sal.setIncrement(salarydto1.getIncrement());
            sal.setAmount(salarydto1.getAmount());
            salaryRepository2.save(sal);
            responseDTO.setMessage("Save employee salaries sucsessfull");
            responseDTO.setStatus(String.valueOf(HttpStatus.CREATED));
            return responseDTO;

        }catch (Exception ex){
            log.error("Internal Server error",ex);
            responseDTO.setMessage("Error: " + ex.getMessage());
            responseDTO.setStatus(String.valueOf(HttpStatus.BAD_REQUEST));

            return responseDTO;

        }
    }

}
