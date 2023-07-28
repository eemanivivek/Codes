import java.util.*;

class c55{
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		ListIterator<Integer> itr = li.listIterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}

		while(itr.hasPrevious()){
			System.out.println(itr.previous()+" ");
		}
	}
}