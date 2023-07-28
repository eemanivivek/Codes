import java.util.Scanner;

class c18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Digits of the number:");

        // Extract each digit from the number
        int temp = number;
        int divisor = 1;
        while (temp >= 10) {
            temp /= 10;
            divisor *= 10;
        }

        while (divisor > 0) {
            int digit = number / divisor;
            System.out.println(digit);
            number %= divisor;
            divisor /= 10;
        }
    }
}
