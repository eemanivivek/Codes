import java.util.*;
public class c4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[]= new int[3];
		int arr2[]= new int[3];
		int temp[]= new int[3];
		int aliceScore=0;
		int bobScore=0;
		boolean skip = false;
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
		for (int i = 0; i < temp.length; i++) { 
            if (arr1[i] > arr2[i]) {
                aliceScore++;
            } else if (arr1[i] < arr2[i]) {
                bobScore++;
            }
        }
         System.out.println(aliceScore+" "+bobScore);
    }
}