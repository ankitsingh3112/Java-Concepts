package com.springcore.standalone;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class Hotel {
	private String name;
	private List<String> locations;
	private HashMap<String,Integer> pricePerDay;
	private Properties HotelDeatils;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(String name, List<String> locations, HashMap<String, Integer> pricePerDay, Properties hotelDeatils) {
		super();
		this.name = name;
		this.locations = locations;
		this.pricePerDay = pricePerDay;
		HotelDeatils = hotelDeatils;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLocations() {
		return locations;
	}

	public void setLocations(List<String> locations) {
		this.locations = locations;
	}

	public HashMap<String, Integer> getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(HashMap<String, Integer> pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public Properties getHotelDeatils() {
		return HotelDeatils;
	}

	public void setHotelDeatils(Properties hotelDeatils) {
		HotelDeatils = hotelDeatils;
	}
	
	
	
	
	

}
