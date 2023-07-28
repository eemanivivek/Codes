import java.util.*;
class c31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n ;i++ ) {
            arr[i]=sc.nextInt();
        }
        reverse(arr);
       
    }

    public static void reverse(int arr[]){
        int n = arr.length;
        int temp=0;
        for (int j=0;j<n ;j++ ) {
                    temp=arr[j];
                    arr[j]=arr[n-1];
                    arr[n-1]=temp;
                    n--;

        } 
         print1(arr);  
    }
    public static void print1(int arr[]){
        for (int i=0;i<arr.length ;i++ ) {
            System.out.print(arr[i]+" ");
        }
    }    
}        