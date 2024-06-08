package com.dinemore.cud.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.transaction.jta.platform.internal.JOnASJtaPlatform;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PayRoll")
@Data
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="PayRoll_ID")
    private String PayrollId;

    @OneToOne
    @JoinColumn(name ="Emp_id")
    private Employee employee;

    @OneToOne
    @JoinColumn(name="job_id")
    private Job job;

    @OneToOne
    @JoinColumn(name="SalId")
    private Salary  salary;

    @OneToOne
    @JoinColumn(name="LeaveID")
    private Leave leave;

    @Column(name ="Allowance")
    private float allowance;

    @Column(name ="Total_salary")
    private float tot_sal;





}
