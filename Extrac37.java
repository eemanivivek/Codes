import java.util.*;
class c37{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(s1.length()==s2.length()){
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			bubblesort(arr1);
			bubblesort(arr2);
			int a = 0;
			boolean flag = false;

			for(int i=0;i<arr1.length;i++){
				if(arr1[i]==arr2[i]){
					// flag=true;
					a++;
				}
			}
			if(a==arr1.length){
				System.out.println("anagram");
			}
			else{
				System.out.println("not");
			}
		}
	}
	public static void bubblesort(char arr[]){
		int n = arr.length;
		for(int i = 0;i<n-1;i++){
			for(int j = i+1 ;j<n;j++){
				if(arr[i]>arr[j]){
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		for(int i = 0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}