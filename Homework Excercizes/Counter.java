

public class Counter 
{
   private int count;
    
    //Constructor: Sets up the value of count to 0.
    
   public Counter() 
   {
      count = 0;
   }
    
    //Method 1: Click - Increments the value of count, and returns the value.
    
   public int click()
   {
      count = count + 1;
      
      return count;
   }
    
    // Method 2: Returns the current count.
    
   public int getCount()
   {
      return count;     
   }
    
    //Method 3: Resets the counter to zero.
    
   public int reset() 
   {
      count = 0;
      return count;
   }
    
}
