package com.asheef.employee_management.model_mongodb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document("salary")
public class SalaryEntity {

    @Id
    @Field(targetType = FieldType.OBJECT_ID)
    private String  id;

    @Field(name = "employee_id",targetType = FieldType.OBJECT_ID)
    private String employeeId;

    @Field(name = "basic_salary")
    private double basicSalary;

    private double bonuses;

    private double deductions;

    @Field(name = "net_salary")
    private double netSalary;

    @Field(name = "salary_month")
    private String salaryMonth;

    @Field(name = "salary_year")
    private String salaryYear;

    @Field(name = "payment_date")
    private Date paymentDate;
}
