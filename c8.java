import java.util.*;
class c8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];

		int count=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();

		}
		int max = arr[0];		
		for(int i=0;i<arr.length;i++){
			if (arr[i]>max) {
				max = arr[i]; 
			}
		}
		for(int i=0;i<n;i++){
			if(max==arr[i]){
				count++;
			}
		}
		System.out.println(count);
	}
}		