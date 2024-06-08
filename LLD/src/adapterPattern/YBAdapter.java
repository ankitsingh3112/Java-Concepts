package adapterPattern;

import adapterPattern.thirdParty.YesBank;

public class YBAdapter implements BankApiAdapter{
	
	YesBank yesbank=new YesBank();

	@Override
	public void sendMoney(String from, String to, double amount) {
		// TODO Auto-generated method stub
		yesbank.sendMoney(from, to, amount);
		
	}

	@Override
	public double checkBalance(String accountNumber) {
		// TODO Auto-generated method stub
		yesbank.printAccount(accountNumber);
		return 0;
	}

	@Override
	public void registerCustomer(String phoneNumber) {
		// TODO Auto-generated method stub
		yesbank.register(phoneNumber);
		
	}

}
