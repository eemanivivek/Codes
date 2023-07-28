import java.util.*;

class c46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        s1 = s1.toLowerCase();
        String result = "";
        String[] words = s1.split(" ");
        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                words[i] = "yes";
            }
            result += words[i] + " ";
        }
        System.out.println(result);
    }
}
