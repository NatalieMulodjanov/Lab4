/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Natalie Mulodjanov
 * @since 2020-04-01 
 */
public class Question1 {
    public static void main(String[] args) {
        
        int i; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("*****PALINDROME OR NOT?*****");
        
        System.out.println("Please enter the word or sentence you want to check");
        
        String stringToCheck = input.nextLine();
         
        String stringNoSpace = stringToCheck.replaceAll(" ","");
        
        String reversed = "";
        
        for (i = stringNoSpace.length() - 1; i >= 0; i--){
          reversed = reversed + stringNoSpace.charAt(i);
            
        }
        System.out.println("The string you have input is: " + stringToCheck);
        System.out.println("Your string reversed is: " + reversed);
        
        if(reversed.equals(stringNoSpace)){
           System.out.println("The string you have input is a Palindrome");
        }else System.out.println("The string you have input is not a Palindrome");
   
        System.out.println("Thank you for using the application, Goodbye!");
    }
}
