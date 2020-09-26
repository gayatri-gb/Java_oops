package oop_practices_java;
// Static, Private mehtods can not be Overriden.
//Base class

// ADVANTAGE : Single action in different ways. calling a method regardless of class.
public class Polymorphism {
	public void example() {
		System.out.println("Example Method of Method Overloading");
	}
	///Method Overloading same method with different parameters -- compile time Polymorphism
	public void example(String sum) {
		
		System.out.println(sum);
	}
	
	public void parent_method() {
		System.out.println("Method in Parent");
	}

}
//Child Class
class Child extends Polymorphism{
	//Method Overriding-- run time Polymorphism
	public void parent_method()
{
		
System.out.println("Overriding same method from the parent class in child class");
}
	}
