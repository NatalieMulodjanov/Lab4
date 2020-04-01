/**
 * Program to calculate the sum of all integers between 10 and 20.
 * Question 46 from the Book Java Illuminated, chapter 6. 
 */
package lab4;

/**
 *
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
    

