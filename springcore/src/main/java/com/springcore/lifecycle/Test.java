package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
		Person person=(Person) context.getBean("p1");
		// Register destroy method
		context.registerShutdownHook();
		
		
		System.out.println(person);

	}

}
