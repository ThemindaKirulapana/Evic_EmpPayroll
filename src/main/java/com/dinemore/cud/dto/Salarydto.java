package com.dinemore.cud.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salarydto {

    private String SalId;
    private String job_name;
    private float amount;
    private float increment;


}
