//==================================================
// Author: James Ortiz
// File: Flight.java
// Purpose: Create a class called Flight
// that shows all related information about a flight
//==================================================

//Initiate class Flight:
public class Flight
{
    //Variable Declarations:
    private String airlineName;
    private int flightNumber;
    private String flightOrigin;
    private String flightDestination;

    //Constructor: Flight()
    public Flight(String airName, int flNumber, String flOrigin, String flDes)
    {
	this.airlineName = airName;
	this.flightNumber = flNumber;
	this.flightOrigin = flOrigin;
	this.flightDestination = flDes;
    }//end Constructor

    //---------------Getter Functions--------------//

    //Function: GetAirlineName()
    public String GetAirlineName()
    {
	return airlineName;
    }

    //Function:
    public int GetFlightNumber()
    {
	return flightNumber;
    }

    //Function: GetFlightOrigin()
    public String GetFlightOrigin()
    {
	return flightOrigin;
    }

    //Function: GetFlightDestination()
    public String GetFlightDestination()
    {
	return flightDestination;
    }


    //---------------Setter Functions--------------//



    //Function SetAirlineName()
    public void SetAirlineName(String airName)
    {
	airlineName = airName;
    }

    //Function SetDestination()
    public void SetDestination(String dest)
    {
	flightDestination = dest;
    }

    //Function SetOrigin()
    public void SetOrigin(String ori)
    {
	flightOrigin = ori;
    }

    //Function SetFlightNumber()
    public void SetFlightNumber(int fNumber)
    {
	flightNumber = fNumber;
    }

    //Function toString()
    public String toString()
    {
	return "The flights name - " + GetAirlineName() + ", number - " +
	    GetFlightNumber() + ", origin - " + GetFlightOrigin() +
	    ", and destination - " + GetFlightDestination() + ".";
    }//end toString()
}//class Flight
