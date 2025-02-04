package com.asheef.employee_management.serviceImpl;

import com.asheef.employee_management.dto.EmployeeDto;
import com.asheef.employee_management.util.ResponseStructure;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {

    public ResponseEntity<ResponseStructure> addEmployee(EmployeeDto employeeDto);
}
