import java.io.*;
import java.util.*;
public class c10 {

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            arr[x]++;
        }
        int count = 0;
        for(int i = 1; i < 100; i++){
            count+=arr[i]/2;
        }
        System.out.println(count);
    }
}