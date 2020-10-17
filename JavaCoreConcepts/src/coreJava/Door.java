package coreJava;

public class Door {

	public Lock lock;
	
	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}

	public Door() {
		lock = new Lock(true);
	}
	
	public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("Shop is closed, please visit later");
		}
		else {
			System.out.println("Welcome!");
		}
	}
	class Lock{
		private boolean lock;
		
		

		public Lock(boolean lock) {
			super();
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
	}
	public static void main(String[] args) {
		Door door = new Door();
		door.shopStatus();
		door.getLock().setLock(false);
		door.shopStatus();
		

	}

}
