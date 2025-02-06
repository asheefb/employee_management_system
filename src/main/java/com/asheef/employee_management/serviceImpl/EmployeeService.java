package com.asheef.employee_management.serviceImpl;

import com.asheef.employee_management.dto.EmployeeDto;
import com.asheef.employee_management.util.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    public ResponseEntity<ResponseDTO> addEmployee(EmployeeDto employeeDto);
}
