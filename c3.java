import java.util.*;
class c3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		int count=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();

		}

		for(int i=0;i<arr.length-1;i++){
			 count += arr[i]+arr[i+1];
			
		}
		System.out.println(count);
	}
}