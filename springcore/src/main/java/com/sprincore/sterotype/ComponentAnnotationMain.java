package com.sprincore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentAnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/sprincore/sterotype/sterotypeconfig.xml");
		
		// put bean name as class name as camel case 
		ComponentAnnotationDemo obj=context.getBean("componentAnnotationDemo",ComponentAnnotationDemo.class);
		
		System.out.println(obj);

	}

}
