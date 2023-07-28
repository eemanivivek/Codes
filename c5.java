import java.util.*;
import java.lang.Math;
class c5{ 
    public static int printPrincipalDiagonal(int mat[][], int n)
    {
    	int count1=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                	count1 += mat[i][j];
                }
            }
        }
        System.out.println("");
        return count1;
    }
    public static int printSecondaryDiagonal(int mat[][], int n)
    {
    	int count2=0;    	
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1)) {
                	count2 += mat[i][j];
                }
            }
        }
        System.out.println("");
        return count2;        
    }
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();    	
    	int mat[][]= new int[n][n];
    	for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            	mat[i][j]=sc.nextInt();
            }	
        }
        int res1 = printPrincipalDiagonal(mat, n);
        int res2 = printSecondaryDiagonal(mat, n);
        System.out.print(Math.abs(res1-res2));
    }
}