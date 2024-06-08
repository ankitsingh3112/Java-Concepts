package Builder;
/*
 * Method Chaining: In java, Method Chaining is used to invoke multiple methods on the same object which occurs as a single statement. 
 * Method-chaining is implemented by a series of methods that return the this reference for a class instance. */

public class Target {
  private String name;
  private String batch;
  private int grad_year;
  private int age;
  private String instructor;
  private double psp;
  


   public Target(String name, String batch, int grad_year, int age, String instructor, double psp) {
    	super();
    	this.name = name;
    	this.batch = batch;
	    this.grad_year = grad_year;
    	this.age = age;
    	this.instructor = instructor;
    	this.psp = psp;
	}
   
   
   
   public Target(Builder builder) {
	    this.name = builder.getName();
    	this.batch = builder.getBatch();
	    this.grad_year = builder.getGrad_year();
   	    this.age = builder.getAge();
   	    this.instructor = builder.getInstructor();
   	    this.psp = builder.getPsp();
   }
   
   // return object of builder from Target class
   public static Builder getBuilder() {
	   return new Builder();
   }
   
   @Override
   public String toString()
   {
	     return "Name: "+this.name
	    	  +"\nBatch: "+this.batch
	    	  +"\nGrad Year: "+this.grad_year
	    	  +"\nAge: "+this.age
	    	  +"\nInstructor: "+this.instructor
	    	  +"\nPSP: "+this.psp;
	    	  
   }
   // Inner Builder class
   public static class Builder{
	   private String name;
	   private String batch;
	   private int grad_year;
	   private int age;
	   private String instructor;
	   private double psp;
	public String getName() {
		return name;
	}
	
	public String getBatch() {
		return batch;
	}
	
	public int getGrad_year() {
		return grad_year;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public double getPsp() {
		return psp;
	}
	
	
	public Builder setName(String name) {
		this.name = name;
		return this;
	}
	
	public Builder setGrad_year(int grad_year) {
		this.grad_year = grad_year;
		return this;
	}
	
	public Builder setBatch(String batch) {
		this.batch = batch;
		return this;
		
	}
	
	public Builder setAge(int age) {
		this.age = age;
		return this;
	}
	
	public Builder setPsp(double psp) {
		this.psp = psp;
		return this;
	}
	
	public Builder setInstructor(String instructor) {
		this.instructor = instructor;
		return this;
	}
	
	public  Target build() {
		return new Target(this);
	}
   }
}
