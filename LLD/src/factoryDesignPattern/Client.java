package factoryDesignPattern;

public class Client {
	private Vechile pVechile;
	
	public Client(VechileFactory vf) {
		pVechile=vf.createVechile();
	}
	
	public Vechile getVechile() {
		return pVechile;
	}

}
