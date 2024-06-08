package com.dinemore.cud.controller;

import com.dinemore.cud.dto.Employeedto;
import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.entity.Employee;
import com.dinemore.cud.service.EmployeeService;
import com.dinemore.cud.service.impl.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/emp")
public class EmployeeController {

    @Autowired
    private  EmployeeServiceimpl employeeService1;

    @PostMapping("/save")
    public ResponseDTO saveEmp(@RequestBody Employeedto employeedto){

        return employeeService1.saveEmployee(employeedto);
    }

    @GetMapping("/get")
    public List<Employeedto>getallemployess(){

        return employeeService1.getAllEmployees();

    }

    @GetMapping("/find/{id}")
    public ResponseDTO findEmployeeID(@PathVariable Long id) {

        return employeeService1.getEmployee(id);
    }

//    @GetMapping("/find/{name}")
//    public ResponseDTO findEmployeeName(@PathVariable String name){
//        return employeeService1.findemployee(name);
//    }

    @DeleteMapping("/delete/{id}")
    public ResponseDTO DeleteEmployee(@PathVariable Long id){
        return employeeService1.DeleteEmployee(id);
    }

    @PutMapping("/update/{id}")
    public ResponseDTO updateEmployee(@RequestBody Employeedto employeedto,Long id){
        return employeeService1.upadateEmployee(employeedto,id);
    }
}
