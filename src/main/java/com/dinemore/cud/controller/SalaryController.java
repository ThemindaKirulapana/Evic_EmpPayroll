package com.dinemore.cud.controller;


import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.dto.Salarydto;
import com.dinemore.cud.service.impl.SalaryServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/salary")
public class SalaryController {
    @Autowired
    private SalaryServiceimpl salaryServiceimpl1;

    @PostMapping("/save")
    public ResponseDTO savesalary(@RequestBody Salarydto salarydto){
        return salaryServiceimpl1.saveSalary(salarydto);
    }



}
