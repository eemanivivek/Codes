import java.util.*;
@SuppressWarnings("unchecked")
public class c59{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");

		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		v.add("F");
		v.add("G");

		System.out.println(al);
		System.out.println(v);
		Collections.copy(al,v);
		System.out.println(v);
		System.out.println(al);

	}
}