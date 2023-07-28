import java.util.*;
class c32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n ;i++ ) {
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        add(arr,x);
    }
    public static void add(int arr[],int x){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                if(arr[i]+arr[j+1]==x){
                    System.out.println(arr[i]+","+arr[j+1]);
                }
            }
        }
    }
}
