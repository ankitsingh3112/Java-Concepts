package Prototype;

public class Client {
	
	// this method will fill required default values to the required attributes
	public static void fillRegistry(Registry registry) {
		
		Target object=new Target();
		object.setBatch("March2023");
		object.setAvgBatchPsp(75.0);
		
		registry.register("March2023", object);
	}

	public static void main(String[] args) {
		// Fill the registry with template object
		
		Registry registry=new Registry();
		fillRegistry(registry);
		
		Target Ankit=registry.get("March2023").copy();
		
		// Will set only Unique attributes, and default template get their val through copy()
		Ankit.setAge(26);
		Ankit.setName("Ankit");
		Ankit.setPsp(90);
		
		System.out.println(Ankit);

	}

}
