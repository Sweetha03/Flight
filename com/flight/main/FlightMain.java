package com.flight.main;

import java.util.List;
import java.util.Scanner;

import com.flight.controller.FlightController;
import com.flight.entity.Flight;

public class FlightMain {
	
	Scanner sc = new Scanner(System.in);
	FlightController server = new FlightController();
	private Flight[] outputFlight;
	
	public static void main(String[] args) {
		
		FlightMain main = new FlightMain();
		
		while(true) {
			
			
			System.out.println("\n\n------------Flight Details------------");
			System.out.println("1.Insert Flight");
			System.out.println("2.Display All Flights");
			System.out.println("3.Flights by Carrier Name");
			System.out.println("4.All Flight Between Source & Destination Airport");
			System.out.println("5.All Flight Between Source & Destination Airport with Price filter");
			System.out.println("6.All Flight Between Source & Destination Airport & Date");
			System.out.println("0.Exit");
			
			System.out.println("---------Enter Choice :- ");
			
			int choice = Integer.parseInt(main.sc.nextLine());
			
			switch (choice ) {
			
			case 1:
				main.takeUserInputFlight();
				break;
			case 2:
				main.displayAllFlights();
				break;
			
			case 3:
				main.getAllFlightByCarrierName();
				break;
			case 4:
				main.getAllFlightBetweenSourceAndDestinationAirport();
				break;
			case 5:
				main.getAllFlightBetweenSourceAndDestinationAirportWithPrice();
				break;
			case 6:
				main.getAllFlightBetweenSourceAndDestinationAirportByDate();
			case 0:
				System.exit(0);
				break;
				
			
				default:
					break;
			}//end of switch
		}

}
	
	
	private void getAllFlightBetweenSourceAndDestinationAirportByDate() {
		
		System.out.println("\n Enter Flight Source");
		String Source = sc.nextLine();
		
		System.out.println("\n Enter Flight Destination");
		String Destination = sc.nextLine();
		
		System.out.println("\n Enter the date");
		String Date = sc.nextLine();
		
		List<Flight> outputData = server.getAllFLightsBetweenSourceAndDestinationByDate(Source, Destination, Date);
		System.out.println("---------------ALL" +Source+Destination+Date+"----------");
		for(Flight flight : outputData) {
			displayFlight(flight,"");
		}
	}


	private void getAllFlightBetweenSourceAndDestinationAirportWithPrice() {
		
		System.out.println("\n Enter Flight Source");
		String Source = sc.nextLine();
		
		System.out.println("\n Enter Flight Destination");
		String Destination = sc.nextLine();
		
		System.out.println("\n Enter Price Range 1");
		int priceRange1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("\n Enter Price Range 2");
		int priceRange2 = Integer.parseInt(sc.nextLine());
		
		List<Flight> outputData = server.getAllFlightBetweenSourceAndDestinationWithPrice(Source, Destination, priceRange1, priceRange2);
		System.out.println("----------ALL "+Source+Destination+priceRange1+priceRange2+ "------------");
		for(Flight flight : outputData) {
			displayFlight(flight, "");
		}
		
	}


	public void takeUserInputFlight() {
		
		try {
			System.out.println("\n\t Enter FLight Details \n");
			System.out.println("Enter flight ID:");
			int flightId = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Carrier Name:");
			String carrierName = sc.nextLine();
			
			System.out.println("Enter Source Airport:");
			String sourceAirport = sc.nextLine();
			
			System.out.println("Enter Destination Airport");
			String destinationAirport = sc.nextLine();
			
			System.out.println("Enter TakeOff Time");
			float takeOffTime = Float.parseFloat(sc.nextLine());
			
			System.out.println("Enter Landing Time");
			float landingTime = Float.parseFloat(sc.nextLine());
			
			System.out.println("Enter Date"); 
			String date = sc.nextLine();
			
			System.out.println("Enter Cost");
			int cost = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Flight Duration");
			float flightDuration = Float.parseFloat(sc.nextLine());
			
			Flight userInsertFlightToBook = new Flight(0, carrierName, sourceAirport, destinationAirport, takeOffTime, landingTime, date, cost, flightDuration);
			
			Flight userInputFlight = null;
			
			Flight serverSavedFlight = server.insertFlight(userInputFlight);
			
			if(serverSavedFlight != null) 
				displayFlight(serverSavedFlight, "Flight Inserted !");
			else 
				displayErrors("Product not saved, Try again or check Authority");
			
		}
		catch (Exception e) {
			displayErrors("Wrong Input, Enter Again");
			takeUserInputFlight();
		}
		
	}
	

	private void displayErrors(String errorMsg) {
		
		System.out.println("_________!!!! Error !!!!_________");
		
		System.out.println(errorMsg);
		
	}

	private void displayFlight(Flight serverSavedFlight, String string) {
		System.out.println(string);
		System.out.println(serverSavedFlight.getFlightID()+"-"+serverSavedFlight.getCarrierName()+"-"+
		serverSavedFlight.getSourceAirport()+"-"+serverSavedFlight.getDestinationAirport()+"-"
				+serverSavedFlight.getTakeOffTime()+"-"+serverSavedFlight.getLandingTime()+"-"+serverSavedFlight.getDate()+
				"-"+serverSavedFlight.getCost()+"-"+serverSavedFlight.getFlightDuration());
	}

	public void displayAllFlights() {
		
		List<Flight>allFlight = server.getAllFlight();
		
		System.out.println("\n\n-------All Saved Flights-------");
		
		for (Flight flight : allFlight) {
			displayFlight(flight,"");
		}
		
	}
	
	public void getAllFlightByCarrierName() {
		
		System.out.println("\n Enter Carrier Name: ");
		String carrierName = sc.nextLine();
		
		List<Flight> outputFlight = server.getAllFlightsByCarrierName(carrierName);
		System.out.println("Carrier Name ");
		
		for(Flight flight : outputFlight) {
			getAllFlightByCarrierName();
		}
	}
	
	public void getAllFlightBetweenSourceAndDestinationAirport() {
		
		System.out.println("\n Flight Between Source and Destination: ");
		String sourceAndDestination = sc.nextLine();
		
		System.out.println("\n Enter Source Airport and Destination Airport: ");
		
		for (Flight flight : outputFlight) {
			displayFlight(flight,"");
		}
		
	}



}
