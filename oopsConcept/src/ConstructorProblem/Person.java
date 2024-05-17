/*
 * Write a Java program to create a class called "Person" with a name and age attribute. 
 * Create two instances of the "Person" class, 
 * set their attributes using the constructor, and print their name and age
 */


package ConstructorProblem;

public class Person {
	    int age;
	    String name;
	    
	    Person(){}
	    
	    public Person(int age,String name) {
	    	this.age=age;
	    	this.name=name;
	    }	
	    	
	    static void display(Person object) {
	    	System.out.println("Name is "+object.name+" age is "+object.age);
	    	
	    }
	    
	    
	   public static void main(String[] args) {
		Person p1=new Person(24,"Vikrant");
		Person p2=new Person(27,"Ankit");
		
		display(p1);
		display(p2);
	}
}
