import java.util.Scanner;

class CalculatorApp {
    public void performOperation( double num1, double num2) {
        for (;;) {
        	System.out.print("Enter your choice : ");
            Scanner scanner = new Scanner(System.in);
            char choice = scanner.next().charAt(0);
            System.out.println("Select an operation:");
            System.outa.println("+. Addition");
            System.out.println("-. Subtraction");
            System.out.println("*. Multiplication");
            System.out.println("/. Division");
            System.out.println("%. Modulus");
            System.out.println("^. Square");
            System.out.println("!. Exit");
            
            double result;
            
            switch (choice) {
                case '+':
                    result = num1 + num2;
                    System.out.println("addition: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("subtraction: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Multiplication: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Division: " + result);
                    } 
                    break;
                case '%':
                    result = num1 % num2;
                    System.out.println("Modulus: " + result);
                    break;
                case '^':
                    result = Math.pow(num1, num2);
                    System.out.println("Square: " + result);
                    break;
                case '!':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        
        }
    }
}