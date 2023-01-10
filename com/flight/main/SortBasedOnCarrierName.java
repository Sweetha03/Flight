package com.flight.main;

import java.util.Comparator;

import com.flight.entity.*;

public class SortBasedOnCarrierName  implements Comparator<Flight>{

	@Override
	public int compare(Flight o1, Flight o2) {
		// TODO Auto-generated method stub
		return o1.getCarrierName().compareTo(o2.getCarrierName());
	}

	
	
}
