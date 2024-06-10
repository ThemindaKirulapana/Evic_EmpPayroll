package com.dinemore.cud.service.impl;

import com.dinemore.cud.dto.Employeedto;
import com.dinemore.cud.dto.Jobdto;
import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.entity.Employee;
import com.dinemore.cud.entity.Job;
import com.dinemore.cud.repository.JobRepository;
import com.dinemore.cud.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class JobServiceimpl implements JobService {


    @Autowired
    private JobRepository jobRepository22;
    @Override
    public Job savejob(Jobdto jobdto) {

        Job job11=new Job();
        job11.setId(jobdto.getJob_id());
        job11.setName(jobdto.getName());
        job11.setDepartment(jobdto.getDepartment());
        job11.setSalary_range(jobdto.getSalary_range());
        return jobRepository22.save(job11);
    }

    @Override
    public List<Jobdto> gettAllJob() {

        List<Jobdto> Job=new ArrayList<>();
        List<Job>Alljobs=jobRepository22.findAll();

        Alljobs.stream().forEach((data->{

            Jobdto jobdto1=new Jobdto();
            jobdto1.setJob_id(data.getId());
            jobdto1.setName(data.getName());
            jobdto1.setDepartment(data.getDepartment());
            jobdto1.setSalary_range(data.getSalary_range());
            Job.add(jobdto1);

        }));
        return Job;
    }

    @Override
    public ResponseDTO getJobByname(String name) {

     ResponseDTO responseDTO=new ResponseDTO();
     responseDTO.setData(jobRepository22.findJobByname(name));
     responseDTO.setStatus("job find Sucsessfull");
     responseDTO.setStatus(String.valueOf(HttpStatus.OK));
     return responseDTO;
    }

    @Override
    public ResponseDTO deletejob(String id) {

        ResponseDTO responseDTOP=new ResponseDTO();
        jobRepository22.deleteById(id);
        responseDTOP.setMessage("ok");
        responseDTOP.setStatus(String.valueOf(HttpStatus.OK));
        return responseDTOP;
    }
}
