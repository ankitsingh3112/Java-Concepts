package AdderSubtractor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			Count count = new Count();
	        Adder adder = new Adder(count);
	        Subtracter subtractor = new Subtracter(count);

	        Thread adderThread = new Thread(adder);
	        Thread subtractorThread = new Thread(subtractor);

	        adderThread.start();
	        subtractorThread.start();

	        adderThread.join();
	        subtractorThread.join();

	        System.out.println(count.value);
		}
		catch(Exception e) {
			System.out.println("Exception caught: "+e.getMessage());
		}

	}

}
