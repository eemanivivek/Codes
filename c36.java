import java.util.*;
class c36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n ;i++ ) {
            arr[i]=sc.nextInt();
        }
        bubblesort(arr);
    }

    public static void bubblesort(int arr[]){
        int n = arr.length;
        int temp;
        for (int i=0;i<n-1 ;i++ ) {
            for (int j=0;j<n-i-1 ;j++ ) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

            System.out.print(arr[n-2]);

    }    
}        