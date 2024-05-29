package com.springcore.constrInj;

public class Company {
	String name;

	public Company(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}
	
	

}
