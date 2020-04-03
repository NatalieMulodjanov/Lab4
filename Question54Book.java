/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 * This program will get as input 10 exam grades. with these grades it will 
 * calculate the minimum grade, maximum grade and average of all grades.
 * @author Natalie Mulodjanov
 * @since 2020-04-01 
 */
public class Question54Book {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("*****MINIMUM, MAXIMUM AND AVERAGE CALCULATOR*****");
        
        int i;
        
        int min = 100, max = 0, total = 0; 
        
        double average = 0;
        
        for(i = 1; i <= 10; i++){
            System.out.println("Please enter the " + i + " exam grade");
            int grade = input.nextInt();
           
            if(grade < min){
                min = grade;
            }
            
            if(grade > max){
                max = grade;
            }
            total += grade;//total is total + grade 
            average = (double) total / i;//nested double to turn total from int to double
        
        } 
        System.out.println("The lowest grade is " + min);
        System.out.println("The highest grade is " + max);
        System.out.println("The average of all grades is " + average);
        System.out.println("Thank you for using the application, Goodbye!");
    }
          
   }

