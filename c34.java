import java.util.*;
class c34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i=0;i<n ;i++ ) {
            arr[i]=sc.nextInt();
            count += arr[i];
        }
        System.out.println(count);
    }
}        