package com.springcore.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com\\springcore\\reference\\refconfig.xml");
		RefClass ref=(RefClass)context.getBean("childref");
		System.out.println(ref.getParent().getClassName());
		System.out.println(ref.getName());
		
		

	}

}
