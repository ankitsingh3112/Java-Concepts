package com.springcore.reference;

public class RefClass {
	private String Name;
	private Parent parent;
	
	public RefClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RefClass(String Name, Parent parent) {
		super();
		this.Name = Name;
		this.parent = parent;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	
	

}
