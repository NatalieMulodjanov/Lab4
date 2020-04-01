/**
 * This program will validate the user ID only if it is exactly 2 digits 
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Natalie Mulodjanov
 * @since 2020-04-01 
 */
public class Question63Book {
    public static void main(String[] args) {
        
        System.out.println("*****USER ID VALIDATION*****");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your user ID here: ");
        
        String id = input.nextLine();
        
        int length = 0;
        
        int i;
        
        for(i = 0; i < id.length(); i++){
           length++; 
        }
        
        if(length == 2){
            System.out.println("Your user ID is valid ");
        }else System.out.println("Your user ID is invalid");
    }
}
