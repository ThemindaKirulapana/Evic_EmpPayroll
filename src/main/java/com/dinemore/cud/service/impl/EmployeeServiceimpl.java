package com.dinemore.cud.service.impl;

import com.dinemore.cud.dto.Employeedto;
import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.entity.Employee;
import com.dinemore.cud.repository.EmployeeRepository;
import com.dinemore.cud.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class EmployeeServiceimpl implements EmployeeService {

    @Autowired
    private  EmployeeRepository employeeRepository;
    @Override
    public ResponseDTO saveEmployee(Employeedto employeedto) {

        ResponseDTO responseDTO=new ResponseDTO();

        try {

            Employee emp1=new Employee();
            emp1.setName(employeedto.getName());
            emp1.setContact_Number(employeedto.getContact_Number());
            emp1.setUsername(employeedto.getUsername());
            emp1.setPassword(employeedto.getPassword());
            emp1.setEmail(employeedto.getEmail());
            emp1.setQalifications(employeedto.getQalifications());
            employeeRepository.save(emp1);
            responseDTO.setMessage("Save employee");
            responseDTO.setStatus(String.valueOf(HttpStatus.CREATED));
            return responseDTO;

        }catch (Exception ex){

            log.error("fail Insert Employee",ex);
            responseDTO.setMessage("Fail Insert Employee");
            responseDTO.setStatus(String.valueOf(HttpStatus.BAD_REQUEST));

            return responseDTO;
        }

    }

    @Override
    public List<Employeedto> getAllEmployees() {
       List<Employeedto>EmployeeList=new ArrayList<>();

       List<Employee> AllEmployees=employeeRepository.findAll();

       AllEmployees.stream().forEach(data->{
           Employeedto employeedto1=new Employeedto();
           employeedto1.setName(data.getName());
           employeedto1.setContact_Number(data.getContact_Number());
           employeedto1.setUsername(data.getUsername());
           employeedto1.setPassword(data.getPassword());
           employeedto1.setEmail(data.getEmail());
           employeedto1.setQalifications(data.getQalifications());
          // EmployeeList.add(employeedto1);
           EmployeeList.add(employeedto1);
       });
       return  EmployeeList;
    }
    @Override
    public ResponseDTO getEmployee(Long id) {

        ResponseDTO responseDTO11=new ResponseDTO();
        responseDTO11.setData(employeeRepository.findById(id));
        responseDTO11.setStatus(String.valueOf(HttpStatus.OK));
        responseDTO11.setMessage("This Employee Avelable");
        return responseDTO11;

    }

    @Override
    public ResponseDTO DeleteEmployee(Long id) {

        ResponseDTO responseDTO22=new ResponseDTO();
        employeeRepository.deleteById(id);
        responseDTO22.setStatus(String.valueOf(HttpStatus.OK));
        responseDTO22.setMessage("This Employee Deleted");
        return responseDTO22;
    }

    @Override
    public ResponseDTO upadateEmployee(Employeedto employeedto, Long id) {

        ResponseDTO responseDTO9=new ResponseDTO();
        Employee employee=employeeRepository.findById(id).orElse(null);
        employee.setName(employeedto.getName());
        employee.setUsername(employeedto.getUsername());
        employee.setContact_Number(employeedto.getContact_Number());
        employee.setEmail(employeedto.getEmail());
        employee.setPassword(employeedto.getPassword());
        employee.setQalifications(employeedto.getQalifications());
        employeeRepository.save(employee);
        return responseDTO9;
    }

//    @Override
//    public ResponseDTO findemployee(String name) {
//
//        ResponseDTO responseDTO32=new ResponseDTO();
//        responseDTO32.setData(employeeRepository.find_By_EmployeeName(name));
//        responseDTO32.setStatus(String.valueOf(HttpStatus.OK));
//        responseDTO32.setMessage("This Employee Avelable");
//        return responseDTO32;
//
//    }
}
