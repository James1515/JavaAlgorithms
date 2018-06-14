/*
*Description: The driver class of "Car" - "CarTest".
*
*/


public class CarTest
{
  /*
  *Description: This is the driver class, of the class "Car".
  */
  
  public static void main(String[] args)
  {
    //Declarations: Car("make", "model", "year")
    
    Car Volvo = new Car("C31", "Four-door", 2001);
    Car Mazda = new Car("Mazda-6", "Four-door", 1984);
    Car Jeep = new Car("Wrangler", "Two-door", 1991);
    
    //Gets make of cars/
    Volvo.getMake();
    Jeep.getModel();
    Mazda.getYear();
    
    //Creates a line of space.
    System.out.println();
    
    //Prints out random data of cars model, makes, and years.
    System.out.println("The make of the Volvo is: " + Volvo.getMake() + " The model of the Jeep is: " + Jeep.getYear() +
                       " The year of the mazda is " + Mazda.getYear());
    
    //Edits the year of each car.                   
    Volvo.setYear(2009);
    Jeep.setYear(1980);
    Mazda.setYear(1989);
    
    //Creates another line of space.
    System.out.println();
    
    //Displays result of the edits to the car's years.
    System.out.println("The year of the volvo car is now: " + Volvo.getYear());
    System.out.println("The year of the Jeep car is now: " + Jeep.getYear());
    System.out.println("The year of the Mazda is now: " + Mazda.getYear());
    
    //Creates another line of space.
    System.out.println();
    
    //Sets a new model for each car.
    Volvo.setModel(" G50");
    Jeep.setModel(" Cherokee");
    Mazda.setModel(" Mazda-Convertible V6");
    
    //Creates a line of space.
    System.out.println();
    
    //Displays the edits to the models of each car.
    System.out.println("Model for Jeep: " + Jeep.getModel());
    System.out.println("Model for Mazda:" + Mazda.getModel());
    System.out.println("Model for Volvo: " + Volvo.getModel());
    
    
    
  }
}
    
    