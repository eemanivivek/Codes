class c51 implements Runnable{
	public void run(){
		System.out.println("yes");
	}
	public static void main(String[] args) {
		c51 cd = new c51();
		Thread t1 = new Thread(cd);
		t1.start();
		System.out.println("hi");
	}
}