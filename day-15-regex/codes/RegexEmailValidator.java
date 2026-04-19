/*
Problem Statement

Write a Java program that checks whether a given string is a valid email address using regex.

Rules

A valid email for this problem should follow:

starts with letters, digits, dot ., underscore _, percent %, plus +, or hyphen -
contains exactly one @
domain name contains letters, digits, dot ., or hyphen -
ends with a top-level domain of at least 2 letters
Example Valid Inputs
test@example.com
john.doe123@gmail.com
user_name+1@company.co.in
Example Invalid Inputs
plainaddress
abc@.com
user@domain
@gmail.com
*/

public class RegexEmailValidator {
    public static boolean emailValidator(String email){
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }
    public static void main(String[] args) {
        String email="john.doe123@gmail.com";
        if (emailValidator(email)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}