package com.flights;

public class FlightsPojo {
	int flightNo;
	String airline,source,destination;
	int depTime,arrTime;
	int price,totTime;
	public FlightsPojo(int flightNo, String airline, String source, String destination, int depTime, int arrTime,
			int price, int totTime) {
		super();
		this.flightNo = flightNo;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.depTime = depTime;
		this.arrTime = arrTime;
		this.price = price;
		this.totTime = totTime;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDepTime() {
		return depTime;
	}
	public void setDepTime(int depTime) {
		this.depTime = depTime;
	}
	public int getArrTime() {
		return arrTime;
	}
	public void setArrTime(int arrTime) {
		this.arrTime = arrTime;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotTime() {
		return totTime;
	}
	public void setTotTime(int totTime) {
		this.totTime = totTime;
	}
	@Override
	public String toString() {
		return "FlightsPojo [FlightNo=" + flightNo + ", Airline=" + airline + ", source=" + source + ", destination="
				+ destination + ", depTime=" + depTime + ", arrTime=" + arrTime + ", price=" + price + ", totTime="
				+ totTime + "]";
	}
	public FlightsPojo() {
		super();
	}
}
