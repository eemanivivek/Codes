class c53 extends Thread{
	public void run(){
		for (int i=0 ;i<5 ;i++ ) {
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		c53 t1 = new c53();
		c53 t2 = new c53();
		t1.start();
		t2.start();
	}
}