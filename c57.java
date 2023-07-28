import java.util.*;

public class c57{
	public static void main(String[] args) {
		ArrayList<c57_1> em = new ArrayList<c57_1>();
		c57_1 e[] = new c57_1[7];
		e[0]=new c57_1(1,"vivek",100000);
		e[1]=new c57_1(2,"vamsi",100000);
		e[2]=new c57_1(3,"yashwanth",100000);
		em.add(e[0]);
		em.add(e[1]);
		em.add(e[2]);
        
		for(c57_1 obj:em){
			obj.print();
		}
	}
}

class c57_1{
	int id;
	String name;
	double sal;
	public c57_1(int id,String name,double sal){
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public void print(){
		System.out.println(id+" "+name+" "+sal);
	}
}