	abstract class Employee{
		abstract void calsal();
	}

	class Full_Employee extends Employee{
		public Full_Employee(int d, int w) {
	        this.d = d;
	        this.w = w;
	    }
		int d,w,sal;
		void calsal(){
			sal =d*w;
			System.out.println(sal);
		}
	}

	class Part_Employee extends Employee{
		public Part_Employee(int d, int w) {
	        this.d = d;
	        this.w = w;
	    }
		int d,w,sal;
		void calsal(){
			sal =d*w;
			System.out.println(sal);
		}
	}


	public class c50{
		public static void main(String[] args) {
			Employee s = new Full_Employee(3,4);
			s.calsal();
			Employee s1 = new Part_Employee(3,5);
			s1.calsal();
		}
	}