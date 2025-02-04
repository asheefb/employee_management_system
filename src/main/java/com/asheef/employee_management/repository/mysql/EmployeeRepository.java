package com.asheef.employee_management.repository.mysql;

import com.asheef.employee_management.model.mysql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
