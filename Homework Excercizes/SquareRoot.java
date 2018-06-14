//
//This program recieves a value from the user, calculates the square root
// of the input, and then displays the answer to two decimal places.
//
//

import java.util.Scanner;
import java.text.DecimalFormat;


public class SquareRoot
{


  public static void main(String[] args)
  {
  
   double SqRt, total;
   
   Scanner scan = new Scanner(System.in);
   
   DecimalFormat fmt = new DecimalFormat("0.##");
   
   System.out.println("Please enter a value");
   
   SqRt = scan.nextDouble();
   
   total  = Math.sqrt(SqRt);
   
   System.out.println("The total is: " + fmt.format(total));
   
   }
}
   
   
   
   
    
