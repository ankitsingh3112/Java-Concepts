package models;

import java.util.Date;

public class Car {
	String numberplate;
	CarType type;
	boolean isAvailable;
	String location;
	
	public Car(String numberplate, CarType type, boolean isAvailable) {
		super();
		this.numberplate = numberplate;
		this.type = type;
		this.isAvailable = isAvailable;
	}

	public String getNumberplate() {
		return numberplate;
	}

	public void setNumberplate(String numberplate) {
		this.numberplate = numberplate;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public boolean isAvailable() {
		// code to find availabilty in that date
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	void rentOut() {
		isAvailable=false;
	}
	
	void returnCar() {
		isAvailable=true;
	}

}
