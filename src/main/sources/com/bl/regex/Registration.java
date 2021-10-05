package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static final Scanner scanner = new Scanner(System.in);

    public boolean validName(String firstname){
        String regex = "^[A-Z]{1}[a-z]{2,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstname);
        return matcher.matches();
    }
    

    public boolean validLastName(String lastname){
        String regex1 = "^[A-Z]{1}[a-z]{3,10}$";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lastname);
        return (matcher1.matches());
    }
}

