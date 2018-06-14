/*
*Problem 4.3: "Car" class
*/

public class Car
{
   private String make;
   private String model;
   private int year;
      
      //Constructor of the class "Car"
   public Car (String auto, String type, int yr)
   {
      make = auto;
      model = type;
      year = yr;
   }
      
      //Method 1: Acessor - Gets make of the car.

   public String getMake()
   {
      return make;
   }
      
      //Method 2: Accessor - Gets model of the car.
   public String getModel()
   {
      return model;
   }
      
      //Method 3: Accessor - Gets year of the car..
      
   public int getYear()
   {
      return year;
   }
      
      
      //Method 5: Prints results to a string format.
   public String toString()
   { 
       
      return "The make is: " + getMake() + "The model is: " + model + "The year is: " + year;
   }
      
      //Method 6: Mutator of car year.
   public void setYear(int yr)
   {
      year = yr;
   }
      
      //Method 7: Mutator of car make.
      
   public void setMake(String auto)
   {
      make = auto;
   }
      
      //Method 8: Mutator of car design.
   public void setModel(String type)
   {
      model = type;
   }    
      
}
