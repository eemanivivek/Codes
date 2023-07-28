import java.util.Scanner;

public class c45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        CalculatorApp obj = new CalculatorApp();
        obj.performOperation(num1, num2);
        

    }
}


