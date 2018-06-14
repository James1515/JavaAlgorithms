
public class ExponentExample
{
  /*
  //This program delcares a variable and then uses the "Math" class to calculate the
  //exponential values and then displays it in both interger form and floating-point form.
  //It also prints calculatons found in section 3.5
  /
  */
  

  public static void main(String[] args)
  {
    int toInterger; 
    
    double Example1, Example2, Example3, Example4, Example5;
    
    double SineValue = Math.sin(1.23); 
    
    double Exponent = Math.pow(5, 2.5); //Computes 5^2.5
    
    System.out.println("\nThe floating-point values of 5 raised to the 2.5th power is: " + Exponent);
    
    toInterger = (int) Exponent;
    
    System.out.println("\nThe interger value of 5 raised to the 2.5th power is: " + toInterger);
    
    System.out.println("\nThe sine value of 1.23 radians is: " + SineValue);
    
    Example1 = Math.abs(10) + Math.abs(-10);
    
    System.out.println(Example1);
    
    Example2 = Math.pow(2, 4);
    
    System.out.println(Example2);
    
    Example3 = Math.pow(4, 2);
    
    System.out.println(Example3);
    
    Example4 = Math.pow(3, 5);
    
    System.out.println(Example4);
    
    Example5 = Math.pow(5, 3);
    
    System.out.println(Example5);
    
   }
}
    
    