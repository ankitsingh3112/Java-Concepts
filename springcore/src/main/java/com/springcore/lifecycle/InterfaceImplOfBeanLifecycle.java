package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceImplOfBeanLifecycle implements InitializingBean, DisposableBean{
	private String name;
	
	

	public InterfaceImplOfBeanLifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public InterfaceImplOfBeanLifecycle(String name) {
		super();
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "InterfaceImplOfBeanLifecycle [name=" + name + "]";
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Starting init method for bean ");
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Running destroy method of bean ");
		
	}

}
