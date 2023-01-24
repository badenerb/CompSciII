//Assignment 1, Problem 3
//Baden Erb

import java.lang.Math;
import java.util.*;

//This program will prompt the user for a number n. Check if the number is an Armstrong number i.e. 
//sum of the cube of individual digits returns the same number. 
 
public class Erb_Problem3
{
   //This method gets a number from the user.
   //It then returns the number, if it is truly an int data type.
   public static int getNum()
   {
      int n = 0;
     
      while (1 == 1)
      {
         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter a number.");
         
      
         //Tries to convert the input into a int variable
         //If succesful the while loop is broken
         try{
            n = Integer.parseInt(scan.nextLine());
            break;
         }
         //If the user puts in anything but an int, this error is thrown and the program loops again.
         catch(NumberFormatException e){
            System.out.println("Please use a whole number.");
         }
      }
      //Returns the scanned integer
      return n;
   }
   
   //This method takes a number as a parameter and then gets the 3rd power of each digit and totals them up
   //It then returns the total
   public static int armstrong(int n)
   {
      int total = 0, remainder;
      while(n != 0)
      {
         remainder = n % 10;
         total = total + (int)Math.pow(remainder, 3);
         n=n/10;
      }
      return total;
    }
   
   public static void main (String[] args)
   {
      //Gets the user number and the armstrong total
      int n = getNum();
      int arm = armstrong(n);
      
      //Checks the armstrong number is the same as teh user number
      if(n == arm)
         System.out.println("This number is an armstrong number!");
      else
         System.out.println("This number is not an armstrong number!");
   }
}