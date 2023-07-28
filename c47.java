import java.util.*;
class c47{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int count = 0;
		int n=s1.length();
		for (int i=0;i<s1.length() ;i++ ) {
			if(s1.charAt(i)!=32) {
				count++;
			}
		}
		System.out.println(count);
	}
}		
