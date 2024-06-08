package com.dinemore.cud.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Job")
@Data
public class Job {

    @Id
    @Column(name ="Job_Id")
    private String id;
    private String name;
    private String department;
    private float salary_range;


}
