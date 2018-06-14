




import java.util.Scanner;
import java.text.DecimalFormat;

public class MedianWholeNumber
{

  public static void main(String[] args)
  { 
  
    Scanner scan = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("0.###");
    double wholeNumber, wholeNumberAdd1, wholeNumberSubtract1;
    
    
    
    System.out.println("Please enter a number: ");
    
    wholeNumber = scan.nextDouble();
    
    wholeNumberAdd1 = (int) wholeNumber + 1;
    
    wholeNumberSubtract1 = (int) wholeNumber - 1;
    
    System.out.println("The whole numbers between the value " + format.format(wholeNumber) + " are " +
     wholeNumberAdd1 + " and " + wholeNumberSubtract1);
     
   }
   
}    
    