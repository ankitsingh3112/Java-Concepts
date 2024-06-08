package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=
				new ClassPathXmlApplicationContext("com/springcore/standalone/standaloneconfig.xml");
		
		Hotel hot=con.getBean("hotel",Hotel.class);
		System.out.println("___________________________________________________________________________________________\n");
		System.out.println(hot.getName());
		System.out.println("___________________________________________________________________________________________\n");
		System.out.println(hot.getLocations());
		System.out.println("___________________________________________________________________________________________\n");
		System.out.println(hot.getPricePerDay());
		System.out.println("___________________________________________________________________________________________\n");
		System.out.println(hot.getHotelDeatils());
	}

}
