import java.util.Scanner;

import java.text.DecimalFormat;

public class VolumeandSurfaceArea
{
 /*
 /This Program calculates the Volume, and the Surface area, when given a value.
 */
 

 public static void main(String[] args)
 {
   double radius, volume, surfaceArea;
   Scanner scan = new Scanner(System.in);
   DecimalFormat fmt = new DecimalFormat("0.####");
   
   
   System.out.println("Please enter the value of the radius: ");
   
   radius = scan.nextDouble();
   
   volume = (4/3 * 3.14 * Math.pow(radius, 3));
   
   surfaceArea = (4 * 3.14 * Math.pow(radius, 2));
   
   System.out.println("The Volume is: " + fmt.format(volume) + " and, the Surface Area is: " +
    fmt.format(surfaceArea));
    
  }
   
}
   
   
   
   
   