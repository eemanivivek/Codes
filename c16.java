 import java.util.*;
 class c16{
 	public static void main(String[] args) {
 		Scanner sc= new Scanner(System.in);
 		int x = sc.nextInt();
        int sum=0,r,temp;
        temp=x;
        while(x>0){
            r=x%10;
            sum = (sum * 10) + r;
            x /= 10;
        }
        String res = temp==sum ? "palindrome" : "Not";
        System.out.println(res);
 	}
 }