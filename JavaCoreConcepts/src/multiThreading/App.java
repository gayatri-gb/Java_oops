package multiThreading;
class Brackets{
	private  String threadCode;
	
	public Brackets(String threadCode) {
	
	this.threadCode = threadCode;
	}

	synchronized static public void generate(String threadCode) {
		for(int i=0;i<=10;i++) {
			if(i<5) {
				System.out.print("[");
			}
			else {
				System.out.print("]");
			}
		}
		System.out.println("Generated by threadCode: "+threadCode);
	}
	
}



public class App {
	private static int counter=0;
	


	public static void main(String[] args) throws InterruptedException {
		Thread thread1= new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<1000;i++) {
					App.counter++;
				}
				
			}
			
			
		});
		System.out.println("thread1");
		Thread thread2= new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<1000;i++) {
					App.counter++;
				}
				
			}
			
			
		});
		System.out.println("thread2");
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println(App.counter);
		
		Brackets brakes= new Brackets("Thread 1");
		Brackets brakes2= new Brackets("Thread 2");
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<=5;i++) {
					brakes.generate("thread1");
				}
				
			}
			
		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<=5;i++) {
					brakes2.generate("thread2");
				}
				
			}
			
		}).start();
		
		
	}
	

}


