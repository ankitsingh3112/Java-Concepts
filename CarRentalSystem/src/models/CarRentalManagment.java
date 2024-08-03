package models;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CarRentalManagment {
	List<Car> cars;
	List<Rental> rentals;
	public CarRentalManagment(List<Car> cars, List<Rental> rentals) {
		super();
		cars = new ArrayList<>();
		rentals=new ArrayList<>();
	}
	
	public void add(Car car) {
		cars.add(car);
	}
	
	public void rentCar(CarType type, User user,String location,LocalDate from, LocalDate to) {
		List<Car> availableCars=findAvailabilty(type,location,from,to);
		if(availableCars!=null) {
			Rental rental=new Rental(availableCars.get(0),user,location,from);
			
		}
	}
	
	// this method is searching in a real time , if car available or not, but we need to find availability for particular date
	public List<Car> findAvailabilty(CarType type,String location,LocalDate rentalDate,LocalDate returnDate) 
	{
		//step 1: filter Car by model and location
	    List<Car> filteredCars= cars.stream().filter(e->e.getType().equals(type) && e.getLocation().equals(location)).collect(Collectors.toList());	
	    
	    // step2: check if filtered car are avail for required dates
	    List<Car> availableCars= new ArrayList<Car>();
	    
	    for (Car car : filteredCars) {
            if (isCarAvailable(car, rentalDate, returnDate)) {
                availableCars.add(car);
            }
        }
	    
	    return availableCars;
		
	}
	
	private boolean isCarAvailable(Car car, LocalDate startDate, LocalDate endDate) {
        // Check rentals for the specified car
        for (Rental rental : rentals) {
            if (rental.getCar().equals(car)) {
                if ((startDate.isBefore(rental.getReturnDate()) && endDate.isAfter(rental.getRentalDate())) || 
                    startDate.equals(rental.getRentalDate()) || endDate.equals(rental.getReturnDate())) {
                    return false;
                }
            }
        }
        return true;
    }

}
