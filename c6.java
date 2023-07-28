import java.util.*;
class c6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			if (arr[i]>0) {
				count1++;				
			}
			else if (arr[i]<0) {
				count2++;
			}
			else if (arr[i]==0) {
				count3++;
			}
			
		}
		float c1=count1;
		float c2=count2;
		float c3=count3;
		float n1=n;
		System.out.println(c1/n1);
		System.out.println(c2/n1);
		System.out.println(c3/n1);
	}
}