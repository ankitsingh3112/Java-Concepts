package factoryDesignPattern;

public class FourWheelerFactory extends VechileFactory{

	@Override
	public Vechile createVechile() {
		// TODO Auto-generated method stub
		return new FourWheeler();
	}

}
