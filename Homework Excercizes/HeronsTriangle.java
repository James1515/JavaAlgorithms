
import java.util.Scanner;
import java.text.DecimalFormat;

public class HeronsTriangle
{

   public static void main(String[] args)
   { 
      Scanner scan = new Scanner(System.in);
      DecimalFormat fmt = new DecimalFormat("0.###");
      
      double perimetrS, lengthA, lengthB, lengthC;
      double Area;
      
      System.out.println(" Please imput the length of 1/2 of the perimater, which is \"s\": " );
      
      perimetrS = scan.nextDouble();
      
      System.out.println("Please input the length of side \"a\": ");
      
      lengthA = scan.nextDouble();
      
      System.out.println("Please enter the length of side \"b\": ");
      
      lengthB = scan.nextDouble();
      
      System.out.println("Please enter the length of side \"c\": ");
      
      lengthC = scan.nextDouble();
      
      Area = Math.sqrt(perimetrS * (perimetrS - lengthA) * (perimetrS - lengthB) * (perimetrS - lengthC));
      
      System.out.println("The total area is: " + fmt.format(Area));
      
   }
}