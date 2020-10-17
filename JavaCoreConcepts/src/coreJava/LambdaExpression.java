package coreJava;
//Functional Interface
 interface Lambda{
	public void demo();
}

public class LambdaExpression {

	public static void main(String[] args) {
	Lambda lambda=()->{
		System.out.println("Statement 1");
		System.out.println("Statement 2");
	};
	lambda.demo();
	
	
	/*Thread thread= new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	});*/
	//reduces the lines of code to simple one line.
	new Thread(()->System.out.println("Statement 1")).start();
	

	}
	

}
