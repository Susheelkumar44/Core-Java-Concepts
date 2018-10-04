package com.flights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.ArrayList;
import java.util.LinkedList;






public class FlightsDetails {
	
	LinkedList<FlightsPojo> flightsList;
	LinkedList<FlightsPojo> sortList=new LinkedList<FlightsPojo>();

	public FlightsDetails() {
		flightsList=new LinkedList<FlightsPojo>();
	}
	public void addFlightsList(FlightsPojo fli)
	{
		flightsList.add(fli);
	}
	public LinkedList<FlightsPojo> getFlightsList()
	{
		return flightsList;
	}
	public LinkedList<FlightsPojo> removeFlightsById(int flightNo)
	{
		for(FlightsPojo fli:flightsList) {
			if(fli.getFlightNo() == flightNo) {
				flightsList.remove(fli);
				return flightsList;
			}
		}
		throw new RuntimeException("Flight does not exists");
	}
	public FlightsPojo getFlightsListById(int flightNo)
	{
		for(FlightsPojo fli:flightsList) {
			if(fli.getFlightNo()==flightNo) {
				return fli;
			}
		}
		throw new RuntimeException("Flight does not exists");
	}
	public LinkedList<FlightsPojo> updateFlightTime(int flightNo,int depTime,int arrTime)
	{
		for(FlightsPojo fli: flightsList) {
			if(fli.getFlightNo()==flightNo) {
				fli.setArrTime(arrTime);
				fli.setDepTime(depTime);
				//fli.setTotTime(totTime);
				return flightsList;
			}
		}
		throw new RuntimeException("Flight does not exists");
	}
	public LinkedList<FlightsPojo> findFlightsByMorning()
	{
		for(FlightsPojo fli:flightsList)
		{
			if(fli.getDepTime()<12)
				return flightsList;
		}
		throw new RuntimeException("flight does not exist");
	}
	public LinkedList<FlightsPojo> sortByCheapestPrice(String source,String destination)
	{
			for(FlightsPojo fli:flightsList) {
			if(fli.getSource().equals(source) && fli.getDestination().equals(destination)) {
				sortList.add(fli);
			}
			}
			Collections.sort(sortList, new Comparator<FlightsPojo>() {
			public int compare(FlightsPojo fli1,FlightsPojo fli2)
			{
				return fli1.getPrice()-fli2.getPrice();
			}
			});	
		return sortList;
	}
	public LinkedList<FlightsPojo> updateFlightDestination(int flightNo,String destination)
	{
		for(FlightsPojo fli: flightsList) {
			if(fli.getFlightNo()==flightNo) {
				fli.setDestination(destination);
				return flightsList;
			}
		}
		throw new RuntimeException("Flight does not exists");
	}
	
	public static void main(String args[])
	{
		FlightsDetails flightsDetails=new FlightsDetails();
		flightsDetails.addFlightsList(new FlightsPojo(1,"Air Asia","Bangalore","Mumbai",1700,1925,2500,145));
		flightsDetails.addFlightsList(new FlightsPojo(2,"Air Asia","Bangalore","Mumbai",735,1035,4250,180));
		flightsDetails.addFlightsList(new FlightsPojo(3,"Indigo","Chennai","Hyderabad",200,330,1050,90));
		flightsDetails.addFlightsList(new FlightsPojo(4,"Jet Airways","New Delhi","Kolkata",1115,1300,5250,150));
		flightsDetails.addFlightsList(new FlightsPojo(5,"Spice Jet","Bangalore","Kolkata",1930,2235,9650,185));
		flightsDetails.addFlightsList(new FlightsPojo(6,"Indigo","Hyderabad","Bangalore",740,1040,2250,180));
		flightsDetails.addFlightsList(new FlightsPojo(7,"Vistara","Bangalore","Mumbai",1700,1925,5500,145));
		flightsDetails.addFlightsList(new FlightsPojo(8,"Vistara","Bangalore","Mumbai",1700,1925,3500,145));
		
		for(FlightsPojo fli:flightsDetails.getFlightsList()) {
			System.out.println(fli);	
		}
		System.out.println("------------------------------------------");
		System.out.println(flightsDetails.getFlightsListById(2));
		
		System.out.println("------------------------------------------");
		for(FlightsPojo fli:flightsDetails.updateFlightTime(5,2030,2335)) {
			System.out.println(fli);	
		}
		System.out.println("------------------------------------------");
		/*for(FlightsPojo fli:flightsDetails.updateFlightDestination(1,"New Delhi")) {
			System.out.println(fli);	
		}*/
		System.out.println("------------------------------------------");
		for(FlightsPojo fli:flightsDetails.removeFlightsById(6)) {
			System.out.println(fli);	
		}
		System.out.println("Sort by price");
		for(FlightsPojo fli:flightsDetails.sortByCheapestPrice("Bangalore","Mumbai")) {
			System.out.println(fli);	
		}
		System.out.println("-------------------------------------------");
		for(FlightsPojo fli:flightsDetails.findFlightsByMorning()) {
			System.out.println(fli);	
		}
	}
	
}
