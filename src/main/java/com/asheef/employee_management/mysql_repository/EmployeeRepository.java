package com.asheef.employee_management.mysql_repository;

import com.asheef.employee_management.model_mysql.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
