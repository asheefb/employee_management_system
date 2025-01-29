package com.asheef.employee_management.model_mysql;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer employeeId;

    @Column(name = "basic_salary")
    private double basicSalary;

    private double bonuses;

    private double deductions;

    @Column(name = "net_salary")
    private double netSalary;

    @Column(name = "salary_month")
    private String salaryMonth;

    @Column(name = "salary_year")
    private String salaryYear;

    @Column(name = "payment_date")
    private Date paymentDate;
}
