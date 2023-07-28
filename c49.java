interface Calc1{
	abstract void add(double a, double b);
	abstract  void sub(double a, double b);
}
interface Calc2 extends Calc1{
	abstract void mul(double a, double b);
	abstract void div(double a, double b);
}

class AP implements Calc2{
	@Override
	public void add(double a, double b){
		System.out.println(a+b);
	}
	@Override

	public void sub(double a, double b){

		System.out.println(a-b);

	}
	@Override

	public void mul(double a, double b){

		System.out.println(a*b);

	}
	@Override

	public void div(double a, double b){

		System.out.println(a/b);

	}

}  

public class c49{
	public static void main(String[] args) {
		AP a = new AP();
		a.add(1,2);
		a.sub(1,2);
		a.mul(1,2);
		a.div(1,2);
	}
}