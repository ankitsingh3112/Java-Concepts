package garbageCollection;

public class Employee {
   
   
   
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   employeeDetails E = new employeeDetails("GFG1", 56);
       employeeDetails F = new employeeDetails("GFG2", 45);
       employeeDetails G = new employeeDetails("GFG3", 25);
       E.show();
       F.show();
       G.show();
       E.showNextId();
       F.showNextId();
       G.showNextId();

       {
           // It is sub block to keep
           // all those interns.
           employeeDetails X = new employeeDetails("GFG4", 23);
           employeeDetails Y = new employeeDetails("GFG5", 21);
           X.show();
           Y.show();
           X.showNextId();
           Y.showNextId();
           X = Y = null;
           System.gc();
           System.runFinalization();
       }
       E.showNextId();


	}

}
