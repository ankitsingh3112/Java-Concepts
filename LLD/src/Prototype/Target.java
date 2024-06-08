package Prototype;

public class Target implements prototype<Target> {
	private String name;
    private int age;
    private double psp;
    private String batch;
    private double avgBatchPsp;
    
    public Target() {}     // we explicitly need to define default constructor as we have created parametrized constructor
    
    // Since Local attributes are private , we need getter and setter method to access them
    
    public Target(Target target) {
        this.name = target.name;
        this.age = target.age;
        this.batch = target.batch;
        this.psp = target.psp;
        this.avgBatchPsp = target.avgBatchPsp;
    }
    
    
	@Override
    public Target copy() {
  	// create instance of Target class and copy the current instance and return the object
  	//Target object =new Target();
//  	object.name=this.name;
//  	object.age=this.age;
//  	object.psp=this.psp;
//  	object.batch=this.batch;
//  	object.avgBatchPsp=this.avgBatchPsp;
  	
  	/*
  	 * Now we can modify or Sugarcoat above way to assign the attributes */
  	
  	Target object=new Target(this);
  	return object;
  }

    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPsp() {
		return psp;
	}

	public void setPsp(double psp) {
		this.psp = psp;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public double getAvgBatchPsp() {
		return avgBatchPsp;
	}

	public void setAvgBatchPsp(double avgBatchPsp) {
		this.avgBatchPsp = avgBatchPsp;
	}


	
	
	@Override
	   public String toString()
	   {
		     return "Name: "+this.name
		    	  +"\nBatch: "+this.batch
		    	  +"\nAge: "+this.age
		    	  +"\nAvg Batch PSP: "+this.avgBatchPsp
		    	  +"\nPSP: "+this.psp;
		    	  
	   }
}
