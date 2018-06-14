/*
*Author: James Ortiz
*
*File: Die.java 
*
*Purpose: Represents one die (singullar of dice) that contains faces
*Showing values 1 to 6.
*
*/


public class Die
{

   private final int MAX = 6;
   private int faceValue;
   
   //Constructor: Sets the value of the die.
   
   public Die()
   {
      faceValue = 1;
   }
   
   //Rolls the die, and returns the result.
   
   public int Roll()
   {
      faceValue = (int)(Math.random() * MAX) + 1;
      return faceValue;
   }
   
   //Facevalue Mutator
   
   public void setFaceValue(int value)
   {
      faceValue = value;
   }
   
   //Face value accessor.
   
   public int getFaceValue()
   {
      return faceValue;
   }
   
   //Returns a string representation of the die.
   
   public String getString()
   {
      String result = Integer.toString(faceValue);  
      return result; 
   }
   
}

