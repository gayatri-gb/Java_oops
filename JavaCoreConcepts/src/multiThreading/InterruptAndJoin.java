package multiThreading;
// join and interrupt need the reference to know on which object it is taking place
//join is used instead of thread.sleep.. 
//notify and interrupt methods is used after wait() to end the execution. 
public class InterruptAndJoin {
	public static int balance=0;
	public void withdraw(int amount) {
		synchronized(this){
		if(balance<=0) {
			try {
				System.out.println("waiting for update");
				wait();
			} catch (InterruptedException e) {
				//System.out.println("thread got interrupted");
				balance= balance-amount;
				System.out.println("Current balance" +balance);
			}
			
		
		}
		}
	}
	
	public void deposit(int amount) {
		System.out.println("Depositing amount");
		balance= balance+amount;
		System.out.println(balance);
	}

	public static void main(String[] args) {
		
		InterruptAndJoin object1 = new InterruptAndJoin();
		InterruptAndJoin object2 = new InterruptAndJoin();
		Thread thread1= new Thread(new Runnable() {

			@Override
			public void run() {
				//object1.deposit(5);
				object1.withdraw(2000);
				
			}
			
			
			
		});
		
		Thread thread2= new Thread(new Runnable() {

			@Override
			public void run() {
				//object2.deposit(5);
				object1.deposit(1000);
				thread1.interrupt();
				try {
					thread1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
			
		});
		
		thread1.start();
		
		thread2.start();
		
	}

}
