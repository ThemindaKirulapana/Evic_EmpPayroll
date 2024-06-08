package com.dinemore.cud.service.impl;

import com.dinemore.cud.dto.Leavedato;
import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.entity.Leave;
import com.dinemore.cud.repository.LeaveRepository;
import com.dinemore.cud.service.LeaveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class LeaveServiceimpl implements LeaveService {
    @Autowired
    private LeaveRepository leaveRepository33;
    @Override
    public ResponseDTO saveLeaveEmp(Leavedato leavedato) {

        ResponseDTO responseDTO=new ResponseDTO();

        try {
            Leave leave1 =new Leave();
            leave1.setLeaveID(leavedato.getLeaveID());
            leave1.setLeave(leavedato.getLeave());
            leave1.setReson(leavedato.getReson());
            leaveRepository33.save(leave1);
            responseDTO.setMessage("Save employee leave");
            responseDTO.setStatus(String.valueOf(HttpStatus.CREATED));
            return responseDTO;

        }catch (Exception X){

            log.error("fail Insert Employee",X);
            responseDTO.setMessage("Fail Insert Employee");
            responseDTO.setStatus(String.valueOf(HttpStatus.BAD_REQUEST));
            return responseDTO;

        }
       // return responseDTO;

    }
}
