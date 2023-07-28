import java.util.*;

class c33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int positiveIndex = n-1;
        int negativeIndex = 0;

        while (positiveIndex <= negativeIndex) {
            if (arr[positiveIndex] < 0 && arr[negativeIndex] >= 0) {
                // Swap positive and negative elements
                int temp = arr[positiveIndex];
                arr[positiveIndex] = arr[negativeIndex];
                arr[negativeIndex] = temp;
                positiveIndex--;
                negativeIndex++;
            } else {
                if (arr[positiveIndex] >= 0) {
                    positiveIndex--;
                }
                if (arr[negativeIndex] < 0) {
                    negativeIndex++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
