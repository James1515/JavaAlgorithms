import java.util.Random;
import java.util.Scanner;

public class excercizeFivepointEight 
{
   public static void main(String[] args)
   {
   
    Random generator = new Random();
    int choice;
    int number1, number2, number3;
    Scanner scan = new Scanner(System.in);
    String again = "";
    choice = 0;
   
    System.out.println("Do you want to play? (Select y to continue)");
     
     while (again.equalsIgnoreCase("y"))
     {
       System.out.println("Welcome to the Slot Machine Program!");
         do
        {
         number1 = generator.nextInt(9);
         number2 = generator.nextInt(9);
         number3 = generator.nextInt(9);
         System.out.print("The numbers are: " + number1 + number2 + number3);
         System.out.println();
         
             if(number1 == number2 && number2 == number3)
             {
               System.out.println("All numbers are equal!");
             }
             else
                 if(number1 != number2 && number2 == number3)
                 {
                    System.out.println("Number 2 and number 3 are equal!");
                 }
                 else
                     if(number3 == number1 && number2 != number1)
                     {
                       System.out.println("Number 1 and number 3 are equal!");
                     }
          
          System.out.println("Would you like to play again? (Input 0 to quit)");   
         };     

       }
   

     } 
     
 }  