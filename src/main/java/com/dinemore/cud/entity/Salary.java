package com.dinemore.cud.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Salary")
@Data
public class Salary {

    @Id
    @Column(name = "Salary_ID")
    private String SalId;

    @OneToOne
    @JoinColumn(name = "job_name")
    private Job job;

    @Column(name = "Amount")
    private float amount;

    @Column(name="Increment")
    private float increment;

}
