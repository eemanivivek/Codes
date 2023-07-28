class c52 extends Thread{
	public void run(){
		System.out.println("yes");
	}
	public static void main(String[] args) {
		c52 t1 = new c52();
		c52 t2 = new c52();
		c52 t3 = new c52();
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.setPriority(6);
		t2.setPriority(3);
		t3.setPriority(9);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
	}
}