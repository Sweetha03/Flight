package com.flight.db;

import java.util.ArrayList;
import java.util.List;

import com.flight.entity.*;
import com.flight.util.*;


/* Replace class with actual DB*/


public class FlightDB {
	
	List<Flight> allFlight = new ArrayList<>();
	public Flight flight;
	
	
	
	public List<Flight> getAllFlight() {
		
		return allFlight;
	}
	


public List<Flight> getAllFlightsByCarrierName (String getCarrierName){
	
	List<Flight> outputFlights = new ArrayList<>();
	
	for (Flight flight : allFlight) {
		
		if(flight.getCarrierName().equalsIgnoreCase(getCarrierName))
		{	
			outputFlights.add(flight);
		}
	}
	
	return outputFlights;
}



public List<Flight> getAllFlightsBetweenSourceAndDestination(String searchSource, String searchDestination) {
	
	List<Flight> outputFlights = new ArrayList<>();
	
	for(Flight flight : allFlight) {
		
		if(flight.getFlightSource().equalsIgnoreCase(searchSource) && flight.getDestinationAirport().equalsIgnoreCase(searchDestination)) {
			
			outputFlights.add(flight);
		}
	}
	return outputFlights;
}


public Flight saveFlightInDB(Flight userInputFlight) {
	
	if(flight != null) {
		flight.setFlightID(FlightUtil.getRandomID());
		boolean status = allFlight.add(flight);
		if(status) return flight;
		else return null;
	}
	else {
		
		return null;
	}
	
}



public List<Flight> getAllFlightBetweenSourceAndDestinationWithPrice(String allFlightSource,
		
		String allFlightDestination, int range1 , int range2) {
	
	List<Flight> outputFlight = new ArrayList<>();
	
	for(Flight flight : allFlight) {
		
		if(flight.getSourceAirport().equalsIgnoreCase(allFlightSource) && (flight.getDestinationAirport().equalsIgnoreCase(allFlightDestination)) && (flight.getCost()>=range1 && flight.getCost()<=range2)) 
		{
			outputFlight.add(flight);
		}
	}
	
	return outputFlight;
}

public List<Flight> getAllFLightsBetweenSourceAndDestinationByDate(String allFlightSource, String allFlightDestination, String date ) {
	
	List<Flight> outputFlight = new ArrayList<>();
	
	for(Flight flight : allFlight) {
		if(flight.getFlightSource().equalsIgnoreCase(allFlightSource)&& (flight.getDestinationAirport().equalsIgnoreCase(allFlightDestination)&&flight.getDate().equalsIgnoreCase(date)))
				{
			outputFlight.add(flight);
		}
	}
	return outputFlight;
}
}





	



	

