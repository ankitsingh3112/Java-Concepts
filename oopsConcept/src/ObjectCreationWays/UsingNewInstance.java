package ObjectCreationWays;


/*
 * Create Object in Java Using newInstance() method
        To use this object creation method, you need to know the class name and ensure that the class has a public default constructor.
                Use Class.forName(<class_name>) to load the Java class.
                To create an object of the loaded class, utilize the newInstance() method, which returns an object of the class.
   */
public class UsingNewInstance {
	
	String name;

	public UsingNewInstance() {
		//super();
		name="Ankit Singh";
	}

	@Override
	public String toString() {
		return "UsingNewInstance [name=" + name + "]";
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		//First load the class by name
		
		Class c=Class.forName("ObjectCreationWays.UsingNewInstance");  // if you simply write the class name, it will throw ClassNotFound
		
		 // Create an instance of the class loaded using newInstance() method
		
		try {
			UsingNewInstance obj=(UsingNewInstance)c.newInstance();
			System.out.println(obj);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Inside Catch block...");
			e.printStackTrace();
		}
	}

	
	

}
