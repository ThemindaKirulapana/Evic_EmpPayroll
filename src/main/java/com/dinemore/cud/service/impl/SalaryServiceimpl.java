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
            sal.setSalId(salarydto1.getSalId());

//            Job job =jobRepository.findJobByname(salarydto1.getJob_name());
//
//            if(job==null){
//                throw new RuntimeException("Job with id"+salarydto1.getJob_name()+"Not Found");
//            }

            sal.setIncrement(salarydto1.getIncrement());
            sal.setAmount(salarydto1.getAmount());
            salaryRepository2.save(sal);
            responseDTO.setMessage("Save employee salaries sucsessfull");
            responseDTO.setStatus(String.valueOf(HttpStatus.CREATED));
            return responseDTO;

        }catch (Exception ex){
            log.error("Internal Server error",ex);
            responseDTO.setStatus(String.valueOf(HttpStatus.BAD_REQUEST));

            return responseDTO;

        }
    }

}
