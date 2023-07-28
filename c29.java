import java.util.*;

class c29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                found = true;
                break;
            }
        }
        String res = found ? "Element found" : "Element not found";
        System.out.println(res);
    }
}
