package adapterPattern;

public interface BankApiAdapter {
	public void sendMoney(String from,String to,double amount);
	
	public double checkBalance(String accountNumber);
	
	void registerCustomer(String phoneNumber);

}
