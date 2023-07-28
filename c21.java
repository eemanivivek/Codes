import java.util.Scanner;
class c21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            int res = arr[i]%2==0 ? count1++ : count2++;   
        }
        System.out.println(count1+" "+count2);
    }
}        