package com.dinemore.cud.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee_Leave")
@Data
public class Leave {

    @Id
    @Column(name ="Leave_Roll_ID")
    private  String LeaveID;

    @ManyToOne
    @JoinColumn(name ="Emp_id")
    private Employee employee;

    @Column(name ="Leave_Date")
    private Date leave;

    @Column(name ="Reson")
    private String reson;


}
