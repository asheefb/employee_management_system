package com.asheef.employee_management.model.mysql.entity;

import com.asheef.employee_management.enums.EmployeeType;
import com.asheef.employee_management.enums.Status;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String departmentId;

    private String designation;

    private Date joiningDate;

    private EmployeeType employmentType;

    private Status status;
}
