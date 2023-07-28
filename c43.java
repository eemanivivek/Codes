import java.util.*;
class c43{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = s1.replaceAll("[aeiouAEIOU]","");
		System.out.println(s2);
	}
}		
