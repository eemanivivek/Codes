	abstract class Shape{
		String color;
		public String getColor(){
			return color;
		}
		public void setColor(String color){
			this.color=color;
		}
		abstract void area();
	}

	class Rectangle extends Shape{
		public Rectangle(int l, int b) {
	        this.l = l;
	        this.b = b;
	    }
		int l,b,area;
		void area(){
			area =l*b;
			System.out.println(area);
		}
	}

	class Square extends Shape{
		public Square(int side) {
	        this.side = side;
	    }
		int side,area;
		void area(){
			area =side*side;
			System.out.println(area);
		}
	}

	class Circle extends Shape{
		public Circle(int r) {
	        this.r=r;
	    }
		double r,area;
		void area(){
			area =Math.PI*r*r;
			System.out.println(area);
		}
	}

	public class c48{
		public static void main(String[] args) {
			Shape s = new Rectangle(3,4);
			s.setColor("red");
			System.out.println(s.getColor());
			s.area();
			Shape s1 = new Square(3);
			s1.setColor("red");
			System.out.println(s1.getColor());
			s1.area();
			Shape s2 = new Circle(4);
			s2.setColor("red");
			System.out.println(s2.getColor());
			s2.area();
		}
	}