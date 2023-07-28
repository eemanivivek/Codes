import java.util.Scanner;

class c44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String result = "";

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }

            result += c;
        }

        System.out.println("Modified string: " + result);
    }
}
