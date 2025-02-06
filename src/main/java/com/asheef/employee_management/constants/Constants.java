package com.asheef.employee_management.constants;

import java.util.regex.Pattern;

public class Constants {

    //add employee
    public static final String ADD_MESSAGE = "Employee Added Successfully!!";
    public static final String SUCCESS = "Success";
    public static final String NAME_SHOULD_NOT_BE_NULL = "Name Should not be null";
    public static final String FIRST_NAME = "First Name";
    public static final String NAME_SHOULD_NOT_BE_GREATER_THAN_FIFTY_AND_LESS_THAN_THREE = "Name should not be greater than 50 and less than 3";
    public static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    public static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    public static final String INVALID_EMAIL = "Invalid Email";
    public static final String EMAIL = "Email";
    public static final String INVALID_PHONE_NUMBER = "Invalid Phone Number";
    public static final String PHONE_NUMBER = "Phone Number";
    public static final String ADDRESS_LINE_1_SHOULD_NOT_BE_EMPTY = "Address line 1 should not be empty";
    public static final String ADDRESS_LINE_1 = "Address line 1";
    public static final String STATE_SHOULD_NOT_BE_EMPTY = "State should not be empty";
    public static final String STATE = "State";
    public static final String CITY_SHOULD_NOT_BE_EMPTY = "City should not be empty";
    public static final String CITY = "city";
    public static final String COUNTRY_SHOULD_NOT_BE_EMPTY = "COUNTRY should not be empty";
    public static final String COUNTRY = "COUNTRY";
    public static final String UNABLE_TO_VALIDATE_DATA = "Unable to validate data";


}
