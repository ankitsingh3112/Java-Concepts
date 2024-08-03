package models;

import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Rental {

	Car car;
	User user;
	ChronoLocalDate rentalDate;
	ChronoLocalDate returnDate;
	String loaction;
	
	
	public Rental(Car car, User user, String loaction, ChronoLocalDate rentalDate) {
		super();
		this.car = car;
		this.user = user;
		this.rentalDate = rentalDate;
		this.loaction = loaction;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ChronoLocalDate getRentalDate() {
		return rentalDate;
	}
	public void setRentalDate(ChronoLocalDate rentalDate) {
		this.rentalDate = rentalDate;
	}
	public ChronoLocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(ChronoLocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	public void book(Car car,User user, String location, ChronoLocalDate rentalDate) {
		this.rentalDate=rentalDate;
	    this.car.rentOut();
	}
	
	public void returnCar(Car car,ChronoLocalDate returnDate) {
		this.returnDate=returnDate;
		this.car.returnCar();
		
	}
	
	
	
}
