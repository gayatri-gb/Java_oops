package coreJava;
//Interface Example
public class Main {

	public static void main(String[] args) {
	Phone phone= new Iphone();
	Phone phone2= new Samsung();
	System.out.println(phone.screenSize());
	
	System.out.println(phone2.screenSize());
	}

}
