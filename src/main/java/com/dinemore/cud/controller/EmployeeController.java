package com.dinemore.cud.controller;

import com.dinemore.cud.dto.Employeedto;
import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.service.impl.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/emp")
public class EmployeeController {


    public String show(){
        return "redirect:Employee";
    }
    @Autowired
    private  EmployeeServiceimpl employeeService1;

      //@PostMapping(value="/save")
     @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseDTO save (@ModelAttribute("Employee") Employeedto employeedto){


           return employeeService1.saveEmployee(employeedto);
         //return "redirect:Employee";
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
