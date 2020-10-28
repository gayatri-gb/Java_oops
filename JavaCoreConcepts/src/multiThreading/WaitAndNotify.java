package multiThreading;

public class WaitAndNotify {
	static public int balance=0;
	
	
	public void withdraw(int amount) {
		synchronized(this){
		if(balance<=0) {
			try {
				System.out.println("Waiting for update");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// wait method is stop for sometime until notify method is executed,
			
			balance= balance- amount;
			System.out.println("withdrawal successful: " +balance);
		}
		}
		
	}
	
	public void deposit(int amount) {
		System.out.println("Depositing amount");
		balance= balance+amount;
		synchronized(this){
		notifyAll();// notify release lock on only one method(method which has longest wait will be released), notifyAll release lock on all methods
	}
	}

	public static void main(String[] args) {
		WaitAndNotify object= new WaitAndNotify();
		new Thread(new Runnable() {

			@Override
			public void run() {
				object.withdraw(1000);
				
			}
			
		} ).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			object.deposit(2000);
				
			}
			
		} ).start();
	}

}
