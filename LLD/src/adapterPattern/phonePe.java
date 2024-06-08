package adapterPattern;

public class phonePe {
	public static void main(String...strings ) {
		BankApiAdapter adapter=new IciciAdapter();  // to change the Service Bank we only need to change the adapter class obj
		adapter.sendMoney("Ankit", "Anuj", 1230.00);
		adapter.checkBalance("Ankit");
		adapter.registerCustomer("9874422547");
	}

}
