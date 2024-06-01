package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfig.xml");
		 Resturant object=context.getBean("rest",Resturant.class);
		 System.out.println(object);
		 
		 ResturantAutowiredAnotationImpl rest=context.getBean("rst",ResturantAutowiredAnotationImpl.class);
		 System.out.println(rest);

	}

}
