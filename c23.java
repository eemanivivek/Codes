import java.util.*;

class c23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }
        
        boolean isEqual = true;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < n; i++){
            if(arr1[i] != arr2[i]){
                isEqual = false;
                break;
            }
        }
        
        if(isEqual){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
