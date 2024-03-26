package garbageCollection;

public class employeeDetails {
	   private int empId;
	   private String name;
	   private int age;
	   private static int nextId=1;
	   
	   employeeDetails(String name,int age){
		   this.age=age;
		   this.name=name;
		   this.empId=nextId++;
	   }
	   
	   public  void show() {
		   System.out.println("Id=" + empId + "\nName=" + name
	               + "\nAge=" + age);
	   }
	   
	   
	   public void showNextId()
	    {
	        System.out.println("Next employee id will be="
	                           + nextId);
	    }
	    protected void finalize()
	    {
	        --nextId;
	        // In this case,
	        // gc will call finalize()
	        // for 2 times for 2 objects.
	    }
}
