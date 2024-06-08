package factoryDesignPattern;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VechileFactory twoWheelerFactory=new TwoWheelerFactory();
		 Client twoWheelerClient = new Client(twoWheelerFactory);
	        Vechile twoWheeler = twoWheelerClient.getVechile();
	        twoWheeler.printVechile();
	        
	        VechileFactory fourWheelerFactory=new FourWheelerFactory();
			 Client fourWheelerClient = new Client(fourWheelerFactory);
		        Vechile fourWheeler = fourWheelerClient.getVechile();
		        fourWheeler.printVechile();

	}

}
