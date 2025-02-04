package com.asheef.employee_management.controller;

import com.asheef.employee_management.dto.EmployeeDto;
import com.asheef.employee_management.serviceImpl.EmployeeService;
import com.asheef.employee_management.util.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public ResponseEntity<ResponseStructure> addEmployee(@RequestBody EmployeeDto employeeDto){

        return employeeService.addEmployee(employeeDto);
    }
}
