import java.util.*;

class c61{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int res = 0;
		while(n != 0) {
			int dig = n%10;
			if(dig==d){
				res++;
			}	
			n = n/10;
		}
		System.out.println(res);
	}
}