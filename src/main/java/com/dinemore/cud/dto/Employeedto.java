package com.dinemore.cud.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employeedto {

    private String name;

    private Long contact_Number;

    private String Username;

    private String password;

    private String Qalifications;

    private String email;

}
