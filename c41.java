import java.util.*;
class c41{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		ls(s1);
	}
	public static void ls(String s1){
		int count = 0;
		int res = 0;
		for (int i = 0;i<s1.length() ;i++ ) {
			if(s1.charAt(i) !=' '){
				count++;
			}
			else{
				res = Math.max(res,count);
				count = 0;
			}
		}
		System.out.println(Math.max(res,count));
	}
}		