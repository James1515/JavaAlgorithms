import java.util.Random;
import java.text.DecimalFormat;

public class SinCosTan
{

  public static void main(String[] args)
  {
  
   int randomNumber;
   double sin, cos, tan;
  
   Random gen = new Random();
   DecimalFormat fmt = new DecimalFormat("0.###");
   
   randomNumber = gen.nextInt(21) + 20;
      
   sin = (double) Math.sin(randomNumber);
      
   cos = (double) Math.cos(randomNumber);
    
   tan = (double) Math.tan(randomNumber);
   
   System.out.println("The random number used: " + fmt.format(randomNumber) + " the sine value: " +
    fmt.format(sin) + " cosine value: " + fmt.format(cos) + " tangent value: " + fmt.format(tan) + " . ");   
   
  }
  
}
   
   
   
   
   
   
   
   
   
   
   
   