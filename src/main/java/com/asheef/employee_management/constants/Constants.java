package com.asheef.employee_management.constants;

import java.util.regex.Pattern;

public class Constants {

    public static final String NAME_SHOULD_NOT_BE_NULL = "Name Should not be null";

    public static final String FIRST_NAME = "First Name";

    public static final String NAME_SHOULD_NOT_BE_GREATER_THAN_FIFTY_AND_LESS_THAN_THREE = "Name should not be greater than 50 and less than 3";

    public static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static final String INVALID_EMAIL = "Invalid Email";

    public static final String EMAIL = "Email";
}
