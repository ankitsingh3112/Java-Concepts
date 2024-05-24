package com.sprincore.collections;
import java.util.*;
public class Resturant {
	private String name;
	private List<String> locations;
	private Set<String> menu;
	private Map<String,Double> rating;
	
	public Resturant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resturant(String name, List<String> locations, Set<String> menu, Map<String, Double> rating) {
		super();
		this.name = name;
		this.locations = locations;
		this.menu = menu;
		this.rating = rating;
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

	public Set<String> getMenu() {
		return menu;
	}

	public void setMenu(Set<String> menu) {
		this.menu = menu;
	}

	public Map<String, Double> getRating() {
		return rating;
	}

	public void setRating(Map<String, Double> rating) {
		this.rating = rating;
	}
	
	

}
