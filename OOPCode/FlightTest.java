//==============================================
// Author: James Ortiz
// File: FlightTest
// Date: Dec 15, 2018
// Purpose: Create a driver class for the
// Flight program.
//==============================================



import java.util.Scanner;



//---------------Driver Program-----------------//

public class FlightTest
{
    //Creates a demo example of an instance of an object
    //of the Flight class.

    public static void main(String[] args)
    {
	Flight f1 = new Flight("Delta", 5500, "Boston, Massachusetts", "Jacksonville, FL");


	//Output of an initialized object called "f1":

        System.out.println("The information initialized in the constructor is as follows:\n");
	
	System.out.println(f1.toString());

	System.out.println("The airline for this trip is: " + f1.GetAirlineName());

	System.out.println("The flight number for this trip is: " + f1.GetFlightNumber());

	System.out.println("The origin of this Flight is: " + f1.GetFlightOrigin());

	System.out.println("The destination of this flight is: " + f1.GetFlightDestination());

	System.out.println("-------------------------------------");



	//Interactive Demonstration:

	Scanner scan = new Scanner(System.in);

	int flight_Number;

	String flight_Origin;

	String flight_Destination;

	String flight_Airline;
	
	//In this demo, we will require the user to enter some
	//input to fill the constructor in the Driver program.

	System.out.println("Please enter an airline for your flight: ");

	flight_Airline = scan.nextLine();
	
	System.out.println("Please enter the flight number: ");

	flight_Number = scan.nextInt();
	
	System.out.println("Please enter flight origin (city & state): ");

	flight_Origin = scan.nextLine();
	
	System.out.println("Please enter flight destination (city & state): ");

	flight_Destination = scan.next();

	Flight f2 = new Flight(flight_Airline, flight_Number, flight_Origin, flight_Destination);

	System.out.println("----------------------------------------------");

	System.out.println(f2.toString());
	
    }//end MAIN
    
}//end FlightTest
