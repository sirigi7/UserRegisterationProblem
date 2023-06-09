package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    static Scanner sc = new Scanner(System.in);

    public static boolean validFirstName() {
        System.out.println("Enter Your first name");
        String name = sc.next();
        //regix function is used to check the first name
        String regix = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regix);
        Matcher m = p.matcher(name);
        boolean result = m.matches();
        // if condition is to check the first name is valid or not
        if (result)
            System.out.println("Your First name is valid");
        else
            System.out.println("Your First name is invalid");
        return result;
    }
    public static boolean validLastName() {
        System.out.println("Enter the Last name");
        String nameLast = sc.next();
        //regix function is used to check the first name
        String regix = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regix);
        Matcher m = p.matcher(nameLast);
        boolean result = m.matches();
        // if condition is to check the Last name is valid or not
        if (result)
            System.out.println("Your Last name is valid");
        else
            System.out.println("Your Last name is invalid");
        return result;
    }
    // taking ValidEmailId method
    public static boolean validEmailId(){
        System.out.println("Enter the email id ");
        String emailId = sc.next();
        String regex = "^[a-z]{3}[a-zA-Z.]{0,}+@+bl.co+[a-z.]{0,}$"; //abc.xyz@bl.co.in
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        boolean result = m.matches();
        // if condition is to check the email id is valid or not
        if (result)
            System.out.println("Your email id is valid");
        else
            System.out.println("Your Email Id is invalid");
        return result;
    }
    public static boolean validPhoneNumber(){
        System.out.println("Enter the phone number ");
        String phoneNumber = sc.nextLine();
        boolean result = Pattern.matches("^91\\s[0-9]{10}$", phoneNumber);
        // if condition is to check the phone number is valid or not
        if (result)
            System.out.println("Your Phone number is valid");
        else
            System.out.println("Your Phone number is invalid");
        return result;
    }
    public static boolean validPassword() {
        System.out.println("Enter the password to check: Hint:- Minimum 8 characters: ");
        String passWord = sc.nextLine();
        boolean result = Pattern.matches("^[0-9A-Za-z]{7,}[@!#$%^&*]{1}$",passWord);
        if (result) {
            System.out.println("The entered password is valid.");
        } else {
            System.out.println("The entered password is invalid. ");
        }
        return result;
    }
    public static boolean validAllEmailId(){
        System.out.println("Enter the email id ");
        String emailId = sc.next();
        /*
        This bellow regex pattern will pass all the email id
        • 1. abc@yahoo.com,
        • 2. abc-100@yahoo.com,
        • 3. abc.100@yahoo.com
        • 2. abc111@abc.com,
        • 4. abc-100@abc.net,
        • 5. abc.100@abc.com.au
        • 6. abc@1.com,
        • 7. abc@gmail.com.com
        • 8. abc+100@gmail.com
         */
        String regex = "^[a-z]{3}[-]{0,}[.+0-9]{0,}+@+[0-9a-z]{1,}+.+[a-z]{2,}[.a-z]{0,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(emailId);
        boolean result = m.matches();
        // if condition is to check the email id is valid or not
        if (result)
            System.out.println("Your email id is valid");
        else
            System.out.println("Your Email Id is invalid");
        return result;
    }

}
