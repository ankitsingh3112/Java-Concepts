package ObjectCreationWays;

import java.lang.reflect.Constructor;

public class ConstructorClassMethod {
	
	String name ;
	Integer age;
	
	public ConstructorClassMethod() {
		// TODO Auto-generated constructor stub
		name="Default name";
		age=0;
	}
	
	public ConstructorClassMethod(String name){
		this.name=name;
	}
	
	public ConstructorClassMethod(String name,Integer age){
		this.name=name;
		this.age=age;
	}
	
	
	@Override
	public String toString() {
		return "ConstructorClassMethod [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// Load the class
	      try {
			Class.forName("ObjectCreationWays.ConstructorClassMethod");
			
			 // Uset the getConstructor() method of Constructor class
		      // to access an existing constructor

		      // Afterwards use the newInstance() method to 
		      // create an instance of the class
		      
		      // We can pass arguments as well in 
		      // newInstance() method of Constructor class
			
			  Constructor c1= ConstructorClassMethod.class.getConstructor(String.class);   // calling parametrized constructor taking string arg
			  ConstructorClassMethod obj1= (ConstructorClassMethod)  c1.newInstance("Ankit Singh");
			  System.out.println(obj1);
			  
			  
			  Constructor c2= ConstructorClassMethod.class.getConstructor();   // calling default constr
			  ConstructorClassMethod obj2= (ConstructorClassMethod)  c2.newInstance();  
			  System.out.println(obj2);
			  
			  Constructor c3= ConstructorClassMethod.class.getConstructor(String.class,Integer.class);
			  ConstructorClassMethod obj3= (ConstructorClassMethod)  c3.newInstance("Nidhi",25);
			  System.out.println(obj3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	     
	}
	

}
