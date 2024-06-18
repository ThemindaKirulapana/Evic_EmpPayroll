package com.dinemore.cud.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salarydto {
   // @NotNull(message = "Salary ID cannot be null")
    @NotEmpty(message = "Salary ID cannot be empty")
    private String SalId;
    private String job_name;
    private float amount;
    private float increment;


}
