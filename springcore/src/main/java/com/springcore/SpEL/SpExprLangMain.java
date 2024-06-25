package com.springcore.SpEL;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class SpExprLangMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/SpEL/SpELconfig.xml");
		
		SpExprLangImpl object= context.getBean("spel",SpExprLangImpl.class);
		System.out.println(object);
		
		

	}

}
