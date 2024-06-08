package com.dinemore.cud.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jobdto {

    private String job_id;
    private String name;
    private String department;
    private float salary_range;

}
