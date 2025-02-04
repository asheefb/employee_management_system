package com.asheef.employee_management.controller;

import com.asheef.employee_management.constants.Constants;
import com.asheef.employee_management.dto.EmployeeDto;
import com.asheef.employee_management.model.mongo.entity.EmployeeModel;
import com.asheef.employee_management.model.mysql.entity.Employee;
import com.asheef.employee_management.util.ErrorStructure;
import com.asheef.employee_management.util.ResponseStructure;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

    public ResponseEntity<ResponseStructure> addEmployee(EmployeeDto employeeDto){

        try {
            EmployeeModel employeeModel = new EmployeeModel();
            Employee mySqlEmployee = new Employee();

            ErrorStructure errorResponse;
            var errors = new ArrayList<>();

            if (employeeDto.getFirstName() == null || employeeDto.getFirstName().isEmpty()){
                errorResponse = new ErrorStructure(employeeDto.getFirstName(), Constants.NAME_SHOULD_NOT_BE_NULL,Constants.FIRST_NAME);
                errors.add(errorResponse);
            } else if (employeeDto.getFirstName().length() < 3 || employeeDto.getFirstName().length() > 50 ) {
                errorResponse = new ErrorStructure(employeeDto.getFirstName(),Constants.NAME_SHOULD_NOT_BE_GREATER_THAN_FIFTY_AND_LESS_THAN_THREE,Constants.FIRST_NAME);
                errors.add(errorResponse);
            } else {
                employeeModel.setFirstName(employeeDto.getFirstName());
                mySqlEmployee.setFirstName(employeeDto.getFirstName());
            }

            employeeModel.setLastName(employeeDto.getLastName());
            mySqlEmployee.setLastName(employeeModel.getLastName());

            if (employeeDto.getEmail() == null || !Constants.EMAIL_PATTERN.matcher(employeeDto.getEmail()).matches()){
                errorResponse = new ErrorStructure(employeeDto.getEmail(),Constants.INVALID_EMAIL,Constants.EMAIL);
                errors.add(errorResponse);
            } else {
                employeeModel.setEmail(employeeDto.getEmail());
                mySqlEmployee.setEmail(employeeDto.getEmail());
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
