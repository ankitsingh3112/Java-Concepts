package com.sprincore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com\\sprincore\\collections\\config.xml"); // not springcore , sprincore
		Resturant rest=(Resturant) context.getBean("hotel");
		System.out.println("Name :"+rest.getName());
		System.out.println("Locations: "+rest.getLocations());
		System.out.println("Best Sellers Dish: "+rest.getMenu());
		System.out.println("Location wise ratings: "+rest.getRating());

	}

}
