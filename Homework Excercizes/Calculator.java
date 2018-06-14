/*
* Name: Calculator.java
* Author: James Ortiz
* Date Created: 1/06/2015
* Purpose: To calculate the amount of pennies, nickels, dimes, and quarters
* and convert the value into dollars, and cents.
*/

import java.util.Scanner;

public class Calculator
{
   
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int pennies, nickels, dimes, quarters;
      
      float total;
      
      System.out.println("Please enter the number of pennies: ");
      
      pennies = scan.nextInt();
      
      System.out.println("Please enter the number of nickels: ");
      
      nickels = scan.nextInt();
      
      System.out.println("Plese enter the number of dimes: ");
      
      dimes = scan.nextInt();
      
      System.out.println("Please enter the number of quarters: ");
      
      quarters = scan.nextInt();
      
      System.out.println();
      
      System.out.println("\nThe following is the total: ");
      
      total = (pennies * .010f + nickels * .050f + dimes * .100f + quarters * .250f);
      
      System.out.println("Your total amount is: $" + total);
      
   }
}