package oop_practices_java;
//data hiding + abstraction = encapsulation in simple term

// ADVANTAGE: data shielding or hiding from outside world.
public class Encapsulation {
//variables encapsulation
	private int id;
	//variable Name is not accessable as no public method is used to get or set this variable
	private String Name;
	private int x1;
	private int y1;
	
	// use setter and getter PUBLIC methods to access the PRIVATE variables otherwise that cant be accessed outside the class.
	public void setid(int id) {
		this.id= id;
	}
	public int getid() {
		return id;
	}
	
	private int addition(int x, int y) {
		return x+y;
	}
		
	//method encapsulation
		public void sum() {
			int x = 5;
			int y = 6;
			int sum = addition(x, y);
			System.out.println(sum);
		}
	}

