package factoryDesignPattern;

public class TwoWheelerFactory extends VechileFactory{

	@Override
	public Vechile createVechile() {
		// TODO Auto-generated method stub
		return new TwoWheeler();
	}

}
