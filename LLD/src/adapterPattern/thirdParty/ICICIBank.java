package adapterPattern.thirdParty;

public class ICICIBank {
	
	public void transferAmount(String from,String to,double amount) {
		System.out.println("Transfered amount in ICICI Bank");
	}
	
	public void addAccount(String phn) {
		System.out.println("Adding new Customer in ICICI Bank ");
	}
	
	public double getAmount(String acc) {
		System.out.println("Getting Account Details from ICICI account");
		return 0.0;
	}

}
