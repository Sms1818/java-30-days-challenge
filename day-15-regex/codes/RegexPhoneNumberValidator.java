/*
Problem

Validate Indian phone numbers:

Valid formats:
9876543210
+919876543210
91-9876543210
Rules:
10 digits OR
optional +91 OR 91-
must start with 6–9
*/

public class RegexPhoneNumberValidator {
    public static boolean phoneNumberValidator(String phoneNumber){
        String regex = "^(\\+91|91-)?[6-9]\\d{9}$";
        return phoneNumber.matches(regex);
    }
    public static void main(String[] args) {
        String phoneNumber="+919876543210";
        if (phoneNumberValidator(phoneNumber)) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }
}