package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class InterfaceImplUsingAnotations {
	private String name;

	public InterfaceImplUsingAnotations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InterfaceImplUsingAnotations(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "InterfaceImplUsingAnotations [name=" + name + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Initializint init method using @PostConstruct Anotation......");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Running destroy() method using @PreDestroy anotation...");
	}

}
