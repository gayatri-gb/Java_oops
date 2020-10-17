package coreJava;
//Interface Example
public class Iphone implements Phone {

	@Override
	public void model() {
	System.out.println("8");
		
	}

	@Override
	public void color() {
		System.out.println("Black");
		
	}

	@Override
	public double screenSize() {
		return 4.7;
	}

}
