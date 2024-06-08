package com.dinemore.cud.controller;

import com.dinemore.cud.dto.Leavedato;
import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.service.LeaveService;
import com.dinemore.cud.service.impl.LeaveServiceimpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/empLeave")
public class LeaveController {


    private LeaveServiceimpl leaveService;
    @PostMapping("/save")
    public ResponseDTO SaveLave(@RequestBody Leavedato leavedato){

        return leaveService.saveLeaveEmp(leavedato);
    }
}
