package com.springcore.autowire;

public class Resturant {
	private Menu menu;
	private String name;
	
	public Resturant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resturant(Menu menu, String name) {
		super();
		this.menu = menu;
		this.name = name;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
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
