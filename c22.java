import java.util.Scanner;

class c22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 1;
        boolean[] visited = new boolean[n];
                for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
        

                System.out.println(arr[i] + " - " + count);
            
        }
    }
}
