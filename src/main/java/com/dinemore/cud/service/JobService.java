package com.dinemore.cud.service;

import com.dinemore.cud.dto.Jobdto;
import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.dto.Salarydto;
import com.dinemore.cud.entity.Job;

import java.util.List;

public interface JobService {

    public Job savejob(Jobdto jobdto);

    public List<Jobdto> gettAllJob();

    public ResponseDTO getJobByname(String name);
}
