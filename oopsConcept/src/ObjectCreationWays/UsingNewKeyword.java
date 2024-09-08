package ObjectCreationWays;

/*
 *  -----Create Object in Java Using new Keyword
            This is the most common way regarding how to create object in java. 
            The new keyword calls constructor of the class implicitly. 
               The constructor can be both parameterized or non-parameterized. 
               The new keyword allocates memory for the object and returns a reference to that object.*/
public class UsingNewKeyword {
	String name;
	int age;
	
    UsingNewKeyword(){
    	name="Ankit is default name";
    	age=25;
    }
    
	public UsingNewKeyword(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
    
	
    @Override
	public String toString() {
		return "UsingNewKeyword [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
    	//Calling default Construcor
    	UsingNewKeyword obj=new UsingNewKeyword();
//The object obj is created using the default no-arg constructor, setting the name attribute to "Ankit" and age to "25" by default.
    	
    	UsingNewKeyword obj1=new UsingNewKeyword("Amit Pratap",33);
//The object obj1 is created using the parameterized constructor, passing the argument "Amit Pratap", which assigns the value to the name attribute.
    	System.out.println(obj);
    	System.out.println(obj1);
		
	}
}
