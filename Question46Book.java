/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 * Program to calculate the sum of all integers between 10 and 20.
 * Question 46 from the Book Java Illuminated, chapter 6. 
 * @author Natalie Mulodjanobv
 * @since 2020-04-01 
 */
public class Question46Book {
    public static void main(String[] args) {
        
       int i, answer = 0;
       
       for(i = 10; i <= 20; i++){
           answer += i;
       }
        System.out.println("The sum of all integers between 10 and 20 inclusive is: " + answer);
      }
   
    }
    

