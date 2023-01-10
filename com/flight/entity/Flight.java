package com.flight.entity;


import java.util.Objects;

public class Flight {

	private int flightID;
	private String carrierName;
	private String sourceAirport;
	private String destinationAirport;
	private float takeOffTime;
	private float landingTime;
	private String date;
	private int cost;
	private float flightDuration;
	public Flight f2;
	  
	
	
	//End of class
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(int flightID, String carrierName, String sourceAirport, String destinationAirport,
			float takeOffTime, float landingTime, String date, int cost, float flightDuration) {
		super();
		this.flightID = flightID;
		this.carrierName = carrierName;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.takeOffTime = takeOffTime;
		this.landingTime = landingTime;
		this.date = date;
		this.cost = cost;
		this.flightDuration = flightDuration;
	}

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public float getTakeOffTime() {
		return takeOffTime;
	}

	public void setTakeOffTime(float takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	public float getLandingTime() {
		return landingTime;
	}

	public void setLandingTime(float landingTime) {
		this.landingTime = landingTime;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public float getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(float flightDuration) {
		this.flightDuration = flightDuration;
	}


	@Override
	public int hashCode() {
		return Objects.hash(carrierName, cost, date, destinationAirport, flightDuration, flightID, landingTime,
				sourceAirport, takeOffTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(carrierName, other.carrierName) && cost == other.cost && Objects.equals(date, other.date)
				&& Objects.equals(destinationAirport, other.destinationAirport)
				&& Float.floatToIntBits(flightDuration) == Float.floatToIntBits(other.flightDuration)
				&& Objects.equals(flightID, other.flightID)
				&& Float.floatToIntBits(landingTime) == Float.floatToIntBits(other.landingTime)
				&& Objects.equals(sourceAirport, other.sourceAirport)
				&& Float.floatToIntBits(takeOffTime) == Float.floatToIntBits(other.takeOffTime);
	}

	@Override
	public String toString() {
		return "Flight [flightID=" + flightID + ", carrierName=" + carrierName + ", sourceAirport=" + sourceAirport
				+ ", destinationAirport=" + destinationAirport + ", takeOffTime=" + takeOffTime + ", landingTime="
				+ landingTime + ", date=" + date + ", cost=" + cost + ", flightDuration=" + flightDuration + "]";
	}


	public String searchSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFlightSource() {
		// TODO Auto-generated method stub
		return null;
	}



	public char[] getFlightCode() {
		// TODO Auto-generated method stub
		return null;
	}

		
	}

