package com.springcore.lifecycle;

public class Person {
	private String PersonName;
	private int age;
	
	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Person [PersonName=" + PersonName + ", age=" + age + "]";
	}

	public void shuru() {
		System.out.println("Starting init method : Shuru()");
		
	}
	
	public void khatam() {
		System.out.println("Starting destroy method: khatam() ");
	}
	

}
