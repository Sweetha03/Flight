package com.flight.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.flight.entity.Flight;

public class MainSort {

	public static void main(String[] args) {
		
		Set<Flight> allFlights = new HashSet<>();
		
		Flight f1 = new Flight(101,"Indigo","Chennai","Delhi",1.00f,3.00f,"1-1-2022",2000,2.00f);
		
		Flight f2 = new Flight(104,"Air India","Chennai","Delhi",3.00f,4.00f,"1-1-2022",2000,2.00f);
		
		Flight f3 = new Flight(103,"Vistara","Chennai","Delhi",1.00f,2.00f,"1-1-2022",3000,1.00f);
		
		allFlights.add(f1);
		allFlights.add(f2);
		allFlights.add(f3);
		
		System.out.println("HashSet :- \n");
		
		for(Flight flight : allFlights) {
			System.out.println(flight);
		}
		
		Set<Flight>allSortedFlights = new TreeSet<>();
		
		allSortedFlights.addAll(allFlights);
		
		System.out.println("\n TreeSet:-\n");
		
		for(Flight flight : allFlights) {
			System.out.println(flight);
			
		System.out.println(flight);
		}
		
		System.out.println("---------------------------------");
		
		System.out.println("Sort Based on Carrier Name");
		
		List<Flight>tempList = new ArrayList<>(allSortedFlights);
		
		SortBasedOnCarrierName sortObj = new SortBasedOnCarrierName();
		
		Collections.sort(tempList, sortObj);
		
		for(Flight flight : tempList) {
			
			System.out.println(flight);
			
		}
		System.out.println("--------------------------------");
		
		System.out.println("Sort Based on Cost");
		
		List<Flight>tempList1 = new ArrayList<>(allSortedFlights);
		
		SortBasedOnCost sortObj1 = new SortBasedOnCost();
		
		Collections.sort(tempList1, sortObj1);
		
		for(Flight flight : tempList1) {
			
			System.out.println(flight);
		}
		
		System.out.println("Sort Based on Duration");
		
		List<Flight>tempList2 = new ArrayList<>(allSortedFlights);
		
		SortBasedOnDuration sortObj2 = new SortBasedOnDuration();
		
		Collections.sort(tempList2, sortObj2);
		
		for(Flight flight : tempList2) {
			
			System.out.println(flight);
		}
	}
}
