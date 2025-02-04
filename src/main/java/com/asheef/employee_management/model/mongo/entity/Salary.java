package com.asheef.employee_management.model.mongo.entity;

import com.asheef.employee_management.enums.SalaryType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document("salary")
public class Salary {

    private Long salary;

    @Field
    private SalaryType salaryType;

    private String bankAccountNumber;

    private String ifscCode;

    private String pfNumber;
}
