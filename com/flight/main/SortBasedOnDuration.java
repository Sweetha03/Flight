package com.flight.main;

import java.util.Comparator;

import com.flight.entity.*;

public class SortBasedOnDuration implements Comparator<Flight>{

	@Override
	public int compare(Flight o1, Flight o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getFlightDuration()-o2.getFlightDuration());
	}
	

}
