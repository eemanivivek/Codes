import java.util.*;
class c13{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int flag =0;
		for (int i=2;i<=n ;i++ ) {
			if(i==2||i==3){
				System.out.println(i);
			}
			else {
				flag=0;
				for (int j=2;j<=i/2 ;j++ ) {
					if(i%j==0){
				       flag=1;
				       break;						
					}
				}
				if(flag==0){
					System.out.println(i);
				}
			}
		}
	}
}		