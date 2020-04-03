/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 * This program will generate a random number between 0 and 100 and ask the user 
 * to guess this number. if the guess is correct, the user will be asked if they want 
 * to play again. if the guess is incorrect, the game will end. 
 * @author Natalie Mulodjanov
 * @since 2020-04-01 
 */
public class Question3 {

    public static void main(String[] args){
        
        System.out.println("******GUESSING GAME!******");
        Scanner input = new Scanner(System.in);
        int i;
        boolean again = true;
     
        do{
          int randomNumber = (int) (Math.random() * 100);
            System.out.println(randomNumber);
            System.out.println("Welcome to the guessing game!");
            System.out.println("\nTry to guess the random number between 0 and 100, you have 10 tries ");
        
           
            for (i = 1; i <= 10; i++){
            String answer;
                int triesLeft = 10 - i;
                int guess = input.nextInt();
                if(guess == randomNumber){
                System.out.println("Correct!!!");
                System.out.println("Would you like to play again? Enter 'true' for yes and 'false' for no");
                answer = input.nextLine();
                    if (answer == "Y") {
                    again = true;
                    } else again = false;
               
                
                }else
                  if (triesLeft > 0)System.out.println("Please try again, you've got " + triesLeft + " more tries");
                  else {System.out.println("You got no more tries,Sorry, Goodbye...");
                  again = false;    
                  }
            }  
        
        }while(again);
       
        System.out.println("Thank you for playing the Guessing Game!");
     }  
        
    }
    
    
    
    
    