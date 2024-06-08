package com.dinemore.cud.service;

import com.dinemore.cud.dto.Employeedto;
import com.dinemore.cud.dto.ResponseDTO;
import com.dinemore.cud.entity.Employee;

import java.util.List;


public interface EmployeeService {

    public ResponseDTO saveEmployee( Employeedto employeedto);
    public List<Employeedto>getAllEmployees();

    public ResponseDTO getEmployee(Long id);

    public ResponseDTO DeleteEmployee(Long id);

  //  public ResponseDTO findemployee(String name);

    public ResponseDTO upadateEmployee(Employeedto employeedto, Long id);

}
