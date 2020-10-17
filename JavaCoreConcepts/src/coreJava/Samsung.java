package coreJava;

public class Samsung implements Phone {

	@Override
	public void model() {
	System.out.println("s10");
	}

	@Override
	public void color() {
		System.out.println("PrismBlue");
		
	}

	@Override
	public double screenSize() {
		
		return 6.1;
	}

}
