package com.flight.controller;

import java.util.List;

import com.flight.db.FlightDB;
import com.flight.entity.Flight;

public class FlightController {
	
	FlightDB db;
	
	public FlightController() {
		db = new FlightDB();
	}
	
	public List<Flight> getAllFlight() {
		return db.getAllFlight();
		
	}
	

	
	public Flight insertFlight(Flight userInputFlight) {
		
		Flight savedFlight = db.saveFlightInDB(userInputFlight);
		return savedFlight;
	}
	

	public List<Flight> getAllFlightsByCarrierName(String userInputCarrierName) {
		
	
		return db.getAllFlightsByCarrierName(userInputCarrierName);
	}
	
	public List<Flight> getAllFlightBetweenSourceAndDestinationAirport(String userInputallFlightSource,String userInputallFlightDestination) {
		
		
		return db.getAllFlightsBetweenSourceAndDestination(userInputallFlightDestination, userInputallFlightSource);
		
	}

	
	public List<Flight>getAllFlightBetweenSourceAndDestinationWithPrice(String allFlightSource,
			
			String allFlightDestination, int range1 , int range2)
	{
		
		return db.getAllFlightBetweenSourceAndDestinationWithPrice(allFlightSource, allFlightDestination, range1, range2);
	}
	
	public List<Flight> getAllFLightsBetweenSourceAndDestinationByDate(String allFlightSource, String allFlightDestination, String date )
	{
		return db.getAllFLightsBetweenSourceAndDestinationByDate(allFlightSource, allFlightDestination, date);
	}
}