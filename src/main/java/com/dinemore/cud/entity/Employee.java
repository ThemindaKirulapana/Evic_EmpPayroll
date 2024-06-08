package com.dinemore.cud.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee", uniqueConstraints = @UniqueConstraint(columnNames = "Username"))
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="Employee_ID")
    private Long  Emp_id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Contact_Number")
    private Long contact_Number;
    @Column(name = "Username")
    private String Username;
    @Column(name = "Password")
    private String password;

    @Column(name = "Qalifications")
    private String Qalifications;

    @Column(name = "Email")
    private String email;



}
