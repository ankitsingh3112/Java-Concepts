package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
		
		// Register destroy method
				context.registerShutdownHook();
				
		//Person person=(Person) context.getBean("p1");
		//InterfaceImplOfBeanLifecycle interfaceImpl=(InterfaceImplOfBeanLifecycle)context.getBean("interfaceImpl");
		
		
		//System.out.println(person);
		//System.out.println(interfaceImpl);
		
		InterfaceImplUsingAnotations ano=(InterfaceImplUsingAnotations)context.getBean("anoImpl");
		System.out.println(ano);

	}

}
