package com.asheef.employee_management.service;

import com.asheef.employee_management.constants.Constants;
import com.asheef.employee_management.dto.EmployeeDto;
import com.asheef.employee_management.enums.Gender;
import com.asheef.employee_management.model.mongo.entity.AddressInformation;
import com.asheef.employee_management.model.mongo.entity.EmployeeModel;
import com.asheef.employee_management.model.mysql.entity.Employee;
import com.asheef.employee_management.repository.mongo.EmployeeModelRepository;
import com.asheef.employee_management.repository.mysql.EmployeeRepository;
import com.asheef.employee_management.serviceImpl.EmployeeService;
import com.asheef.employee_management.util.ErrorStructure;
import com.asheef.employee_management.util.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeModelRepository employeeModelRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ResponseEntity<ResponseDTO> addEmployee(EmployeeDto employeeDto) {

        ResponseDTO response;
        HttpStatus httpStatus;

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

            if (employeeDto.getPhoneNumber() ==null || employeeDto.getPhoneNumber().length() != 10){
                errorResponse = new ErrorStructure(employeeDto.getPhoneNumber(), Constants.INVALID_PHONE_NUMBER , Constants.PHONE_NUMBER);
                errors.add(errorResponse);
            } else {
                employeeModel.setPhoneNumber(employeeDto.getPhoneNumber());
                mySqlEmployee.setPhoneNumber(employeeDto.getPhoneNumber());
            }

            employeeModel.setDateOfBirth(new Date("2010-06-02"));
            mySqlEmployee.setDateOfBirth(new Date("2010-06-02"));

            employeeModel.setGender(Gender.MALE);
            mySqlEmployee.setGender(Gender.MALE);

            AddressInformation addressInformation = new AddressInformation();

            if (employeeDto.getAddressLine1() == null || employeeDto.getAddressLine1().length() < 3){
                errorResponse = new ErrorStructure(employeeDto.getAddressLine1(), Constants.ADDRESS_LINE_1_SHOULD_NOT_BE_EMPTY,Constants.ADDRESS_LINE_1);
                errors.add(errorResponse);
            } else {
                addressInformation.setAddressLine1(employeeDto.getAddressLine1());
                mySqlEmployee.setAddressLine1(employeeDto.getAddressLine1());
            }

            addressInformation.setAddressLine2(employeeDto.getAddressLine2());
            mySqlEmployee.setAddressLine2(employeeDto.getAddressLine2());

            if (employeeDto.getState() == null || employeeDto.getState().isEmpty()){
                errorResponse = new ErrorStructure(employeeDto.getState(),Constants.STATE_SHOULD_NOT_BE_EMPTY,Constants.STATE);
                errors.add(errorResponse);
            } else {
                addressInformation.setState(employeeDto.getState());
                mySqlEmployee.setState(employeeDto.getState());
            }

            if (employeeDto.getCity() == null || employeeDto.getCity().isEmpty()){
                errorResponse = new ErrorStructure(employeeDto.getCity(), Constants.CITY_SHOULD_NOT_BE_EMPTY ,Constants.CITY);
                errors.add(errorResponse);
            } else {
                addressInformation.setCity(employeeDto.getCity());
                mySqlEmployee.setCity(employeeDto.getCity());
            }

            if (employeeDto.getCountry() == null || employeeDto.getCountry().isEmpty()){
                errorResponse = new ErrorStructure(employeeDto.getCountry(), Constants.COUNTRY_SHOULD_NOT_BE_EMPTY ,Constants.COUNTRY);
                errors.add(errorResponse);
            } else {
                addressInformation.setCountry(employeeDto.getCountry());
                mySqlEmployee.setCountry(employeeDto.getCountry());
            }

            employeeModel.setAddressInformation(addressInformation);

            employeeModel.setCreatedAt(new Date());
            employeeModel.setUpdatedAt(new Date());

            if (!errors.isEmpty()){
                response = new ResponseDTO(Boolean.FALSE,HttpStatus.BAD_REQUEST.value(), errors);
                httpStatus = HttpStatus.BAD_REQUEST;
                return new ResponseEntity<>(response,httpStatus);
            }

            var erp = employeeRepository.save(mySqlEmployee);

            employeeModel.setMysqlId(erp.getId());

            employeeModelRepository.save(employeeModel);


            response = new ResponseDTO(Boolean.TRUE,HttpStatus.OK.value(), Constants.ADD_MESSAGE ,Constants.SUCCESS);
            httpStatus = HttpStatus.OK;

        } catch (Exception e) {

            log.error("e: ", e);

            response = new ResponseDTO(Boolean.FALSE,HttpStatus.UNPROCESSABLE_ENTITY.value(),Constants.UNABLE_TO_VALIDATE_DATA);
            httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
        }

        return new ResponseEntity<>(response,httpStatus);
    }
}
