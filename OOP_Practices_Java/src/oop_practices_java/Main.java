package oop_practices_java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism poly = new Child(); // creating a reference for child using parent class.
		poly.parent_method();
		String sum = "Example Method2 of OverLoading";
		poly.example(sum);
		Inheritance_Child child  = new Inheritance_Child();
		child.method1(); // calling parent method using child reference.
		Encapsulation encap = new Encapsulation();
		encap.setid(1);
		System.out.println(encap.getid());
		
		encap.sum();// performed addition 
Abstraction abs = new Abstraction();
System.out.println(abs.area());
	}

}
