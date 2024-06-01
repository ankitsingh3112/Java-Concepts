package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class ResturantAutowiredAnotationImpl {

	
	private Menu menu;
	private String name;
	
	public ResturantAutowiredAnotationImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResturantAutowiredAnotationImpl(Menu menu, String name) {
		super();
		this.menu = menu;
		this.name = name;
	}

	public Menu getMenu() {
		return menu;
	}

	@Autowired
	public void setMenu(Menu menu) {
		this.menu = menu;
		System.out.println("***** Inside Setter Method for Autowire Impl using Anotaions ****** ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Resturant [menu=" + menu + ", name=" + name + "]";
	}
}
