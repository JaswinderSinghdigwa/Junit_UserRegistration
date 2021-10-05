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
        String regex1 = "^[A-Za-z]{1}[a-z]{3,10}$";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(lastname);
        return matcher1.matches();
    }
    
    public boolean validEmail(String email){
        String regex2 = "^A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(email);
        return matcher2.matches();
    }
    
    public boolean validPhoneNumber(String mobileno){
        String regex3 = "^(0/91)?[7-9][0-9]{10}$";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(mobileno);
        return matcher3.matches();
    }
    
    public boolean validPasswordRule1(String password){
        String regex4 = "^[A-Z a-z 0-9]{8,}$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(password);
        return matcher4.matches();
    }
    
    public boolean validPasswordRule2(String password1){
        String regex5 = "^[A-Z]{1}+[a-zA-z0-9]{8,}$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(password1);
        return (matcher5.matches());
    }
    
    public boolean validPasswordRule3(String password2){
        String regex6 = "^[A-Z]{1}+[0-9].{8,}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(password2);
        return matcher6.matches();
    }
    
    public  boolean validPasswordRule4(String password3){
        String regex6 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8, 20}$";
        Pattern pattern6 = Pattern.compile(regex6);
        Matcher matcher6 = pattern6.matcher(password3);
        return matcher6.matches();
    }
    
}