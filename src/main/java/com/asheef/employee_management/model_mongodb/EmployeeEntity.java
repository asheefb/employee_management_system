package com.asheef.employee_management.model_mongodb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import javax.persistence.Id;
import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document("employee")
public class EmployeeEntity {

    @Id
    @Field(targetType = FieldType.OBJECT_ID)
    private String id;

    private String name;

    private String email;

    @Field(name = "phone_number")
    private String phoneNumber;

    private String address;

    @Field(targetType = FieldType.OBJECT_ID,name = "department_id")
    private Integer departmentId;

    @Field(targetType = FieldType.OBJECT_ID,name = "role_id")
    private String  roleId;

    private double salary;

    @Field(targetType = FieldType.OBJECT_ID,name = "project_id")
    private String  projectId;

    @Field(name = "joining_date")
    private Date joiningDate;

    private String designation;

    @Field(targetType = FieldType.OBJECT_ID,name = "status_id")
    private String  statusId;
}
