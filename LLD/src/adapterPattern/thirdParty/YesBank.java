package adapterPattern.thirdParty;

public class YesBank {
	
	public void sendMoney(String sender, String receiver, double amnt) {
		System.out.println(
				" Transfering amount in YES BANK");
	}
	
	public void register(String phn) {
		System.out.println("Adding new Customer in YES Bank ");
	}
	
	public double printAccount(String acc) {
		System.out.println("Getting Account Details from YES account");
		return 0.0;
	}

}
