/*
Problem

Validate a password with rules:

Requirements:
At least 8 characters
At least 1 uppercase letter
At least 1 lowercase letter
At least 1 digit
At least 1 special character (@#$%^&+=)
No spaces allowed
Example Valid:
Abc@1234
Strong#Pass1
Example Invalid:
abc123      (no uppercase, no special)
ABC@123     (no lowercase)
Abc 1234    (contains space)
*/

public class RegexPasswordValidator {
    public static boolean passwordValidator(String password){
        String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])[A-Za-z\\d@#$%^&+=]{8,}$";
        return password.matches(regex);
    }
    public static void main(String[] args) {
        String pasString="Abc@1234";
        if (passwordValidator(pasString)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        
    }
}

