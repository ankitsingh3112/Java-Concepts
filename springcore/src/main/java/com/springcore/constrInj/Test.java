package com.springcore.constrInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/constrInj/ciconfig.xml");
//		Employee employee=(Employee )context.getBean("emp");
//		System.out.println(employee);
//		
		AmbiguityExample amb=(AmbiguityExample) context.getBean("amb");
		System.out.println(amb.show());
	}

}
