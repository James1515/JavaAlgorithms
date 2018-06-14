
/*
*
*
*/

public class CounterTest 
{
   public static void main(String[] args)
   {
      //Declarations
      Counter count1, count2;
      int sum;
      count1 = new Counter();
      count2 = new Counter();
      
      //Adds 1 to objects count1 and count2
      count1.click();
      count2.click();
      
      //Prints current count
      System.out.println("The current count is: " + count1.click() + " and " + count2.click());
      
      
      
      //Adds the sum of count1 and count2.
      sum = count1.getCount()  + count2.getCount();
      //Dispalys the sum of both.
      System.out.println("The sum of both is: " + sum);
      
      //Resets the value of both count1 and count2.
      
      //Prints value of both count1 and count2.
      
      System.out.println("The value of both when they are reset is: " + count1.reset() +
             " and " + count2.reset()); 
     
   }
   
}
