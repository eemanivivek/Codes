import java.util.Scanner;

class c17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        for (int i = start; i <= end; i++) {
            int temp = i;
            int sum = 0;
            
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}
