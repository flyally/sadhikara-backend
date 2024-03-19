package com.sadhikara.utils;

/**
 * All regex patterns for validation stacks here
 */

public class StringPattern {

    public StringPattern() {}

    public static final String NAME = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";

    public static final String EMAIL = "^[a-zA-Z0-9-.]+(?:\\." + "^[a-zA-Z0-9]+)*@" + "(?:[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,7}){1,2}$)";

    public static final String MOBILE_NUMBER = "[6-9][0-9]{9}";

}
