/**
 * This program will validate an email input from the user.
 * The email will only be validated if it contains '@' and then '.' .
 * A valid email is of format: example@example.com or example@example.example.com
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Natali Mulodjanov
 * @since 2020-04-01 
 */
public class Question2 {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("*****EMAIL VALIDATION PROGRAM*****");
        System.out.println("Please enter an email address to validate");
        
        String email = input.nextLine();
        boolean valid = true;
        int index1 = email.indexOf('@');
        
        int i;
        
        for(i = 0; i < email.length(); i++){
            if(email.contains("@")){
                for (i = index1; i < email.length(); i++){
                    if(email.contains(".")){
                        valid = true;
                    }else valid = false;
                }
            }else valid = false;
        }
    if(valid) System.out.println("This email is VALID");
    else System.out.println("This email is INVALID");
    System.out.println("Thank you for using the application, Thank you. Goodbye!");
    }
    
}
