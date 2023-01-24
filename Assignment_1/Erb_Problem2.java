//Assignment 1, Problem 2
//Baden Erb

import java.util.*;

//This program will play a guessing game. Pick any number between 1 and 1000. Prompt the user  
//to guess numbers until the player guesses the correct number. For every guess,  
//output "Too high" or "Too low", and then ask for another input. At the end of the game, 
//the number is revealed along with the number of guesses it took to get the correct 
//number. 
 
public class Erb_Problem2
{
   //This method checks to see if the given number, n, is higher, lower, or the same as the other passed number, rand.
   //If n is higher or lower it prints the corresponding hint
   //If n is the same as rand, it returns 0
   //
   //0 is returned if the numbers are the same
   //1 is returned if the numbers are different
   public static int check(int n, int rand)
   {
      //Variable to be returned
      int num = 1;
      
      //Checks the values of the two passed variables
      if(n > rand)
         System.out.println("Too high");
      else if(n < rand)
         System.out.println("Too low");
      else
         num = 0;
      
      //Return statement
      return num;
   }
   
   //This method gets a number from the user.
   //It then returns the number, if it is truly an int data type.
   public static int getNum()
   {
      int n = 0;
     
      while (1 == 1)
      {
         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter a number to guess.");
         
      
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
   
   public static void main (String[] args)
   {
      int randNum = (int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
      int x = 1;
      int count = 0;
      int n = 0;

      while(x != 0)
      {
         n = getNum();
         x = check(n, randNum);
         count ++;
      }
      System.out.println("You got it! The random number was " + randNum  + ". It took you " + count + " guesses to get it right.");
   }
}