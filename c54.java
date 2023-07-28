class c54 {
	public static void main(String[] args) throws InterruptedException {
		c54_1 cd = new c54_1();
		cd.start();
		synchronized(cd){
			System.out.println("main calling wait() method");
			cd.wait();
			System.out.println("main got notification calling");
			System.out.println("total balance: "+cd.td);
		}
	}
}

class c54_1 extends Thread{
	int td=0;
	public void run(){
		synchronized(this){
			System.out.println("child starts caluclation for total");
			for (int i=0 ;i<50 ;i++ ) {
				td += i;
			}
			System.out.println("child got notification calling");
			this.notify();
		}
	}
}