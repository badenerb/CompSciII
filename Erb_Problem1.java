//Assignment 1, Problem 1
//Baden Erb
import java.util.*;

//This program will get a number "n" from a user and tell the user how many digits are in the number.

public class Erb_Problem1
{
   public static void main (String[] args)
   {
      //Get the number from the user.
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a number");
      int n = 0;
      
      //Tries to convert the input into a int variable
      try{
         n = Integer.parseInt(scan.nextLine());
      }
      //If the user puts in anything but an int, this error is thrown and the program exits.
      catch(NumberFormatException e){
         System.out.println("Please rerun the program using a whole number.");
         System.exit(0);
      }
      
      //This counts the amount of digits in the int.
      int digits = 0;
      
      while(n != 0)
      {
         n=n/10;
         digits++;
      }
      
      System.out.println("You have " + digits + " digits in your number.");
   }
}