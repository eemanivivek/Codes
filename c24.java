import java.util.Scanner;
class c24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[][] = new int[n][n];
        int arr2[][] = new int[n][n];
        int c[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }    
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = sc.nextInt();
            }    
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=arr1[i][j]+arr2[i][j];
                System.out.println(c[i][j]+"");
            }    
        }
    }
}        