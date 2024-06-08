package adapterPattern;

import adapterPattern.thirdParty.ICICIBank;

public class IciciAdapter implements BankApiAdapter{
	ICICIBank icicibank=new ICICIBank();

	@Override
	public void sendMoney(String from, String to, double amount) {
		// TODO Auto-generated method stub
		icicibank.transferAmount(from, to, amount);
	}

	@Override
	public double checkBalance(String accountNumber) {
		// TODO Auto-generated method stub
		icicibank.getAmount(accountNumber);
		return 0;
	}

	@Override
	public void registerCustomer(String phoneNumber) {
		// TODO Auto-generated method stub
		icicibank.addAccount(phoneNumber);
		
	}
	
	
}
