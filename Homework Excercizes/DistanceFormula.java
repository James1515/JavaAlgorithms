
import java.util.Scanner;

public class DistanceFormula
{

  public static void main(String[] args)
  {
    int x1, y1, x2, y2, firstSub, secondSub;
    double Distance;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter the first x coordinate: ");
    
    x1 = scan.nextInt();
    
    System.out.println("Please enter the second x coordinate: ");
    
    x2 = scan.nextInt();
    
    System.out.println("Please enter the first y coordinate: " );
    
    y1 = scan.nextInt();
    
    System.out.println("Please enter the second y coordinate: ");
    
    y2 = scan.nextInt();
    
    firstSub = (x2 - x1);
    
    secondSub = (y2 - y1);
    
    Distance = Math.sqrt(Math.pow(firstSub, 2) + Math.pow(secondSub, 2));
    
    System.out.println("The distance between the two coordinates is the following: " + Distance);
    
    }
    
}
    
    
    
    