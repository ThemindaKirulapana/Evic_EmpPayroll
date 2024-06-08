package com.dinemore.cud.dto;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Leavedato {

    private  String LeaveID;
    private Date leave;
    private String reson;
}
