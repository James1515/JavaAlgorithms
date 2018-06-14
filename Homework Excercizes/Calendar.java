import java.util.*;

public class Calendar
{  
   
   public static void main(String[] args)
   {
     int year;
     Scanner scan  = new Scanner(System.in);
     year = 0;
     System.out.println("Please enter a year to check if it is a leap year: ");
     year = scan.nextInt();
     
     if (year >= 1582)
        if((year%4 != 0)   &&  (year%100 != 0))
        {
          System.out.println("The year is a leap year!");
        } 
        else
         {
           System.out.println("The year is not a leap year!");
         }
     }
}