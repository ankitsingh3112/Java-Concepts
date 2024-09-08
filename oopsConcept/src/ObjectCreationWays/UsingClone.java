package ObjectCreationWays;

/*Create Object in Java Using clone() Method
-->The clone() method generates a new object with a distinct hash code and stores it in a separate memory location.
-->clone() produces a replica of an existing object with identical attribute values.
-->clone() generates an object of a class without invoking any class constructors.
-->Modifying the values of one object does not affect the other.

Prerequisite: For utilizing this method, the class must implement the Cloneable interface and define its own clone() method.
Hence, the concept of cloning can also help in how to create object in java.
 * */

public class UsingClone implements Cloneable {
	
	@Override
	  protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	  }
	  
	  String name="Ankit Singh";
	  int  age=33;
	  
	  
	  
	  @Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		UsingClone c=new UsingClone();
		
		try {
			UsingClone obj2=(UsingClone)c.clone();
			
			System.out.println("First Object: "+c);
			System.out.println("Second object: "+obj2);
			
			System.out.println("Updating first object attribute ....");
			c.name="Nidhi Kumari";
			c.age=26;
			
			System.out.println("First Object: "+c);
			System.out.println("Second object: "+obj2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
