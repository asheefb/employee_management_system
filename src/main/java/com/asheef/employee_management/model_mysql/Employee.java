package com.asheef.employee_management.model_mysql;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String address;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "role_id")
    private Integer roleId;

    private double salary;

    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "joining_date")
    private Date joiningDate;

    private String designation;

    @Column(name = "status_id")
    private Integer statusId;
}
