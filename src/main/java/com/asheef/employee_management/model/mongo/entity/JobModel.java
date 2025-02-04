package com.asheef.employee_management.model.mongo.entity;

import com.asheef.employee_management.enums.EmployeeType;
import com.asheef.employee_management.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document("job_model")
public class JobModel {

    @Field(targetType = FieldType.OBJECT_ID)
    private Integer id;

    @Field(value = "department_id")
    private String departmentId;

    private String designation;

    @Field(value = "joining_date")
    private Date joiningDate;

    @Field(value = "employment_type")
    private EmployeeType employmentType;

    private Status status;
}
