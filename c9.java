import java.util.*;
class c9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int count = 0;
        count=x;
		int temp=0;
		int[] grades = new int[x];
		for(int i=0; i < x; i++){
            grades[i] = sc.nextInt();
        }
		for (int i = 0;i<x;i++){
			if (count%5==0) {
				temp=count;
				break;
			}
			else{
				count++;
			}
		}
		if (temp>=40) {
			if ((temp-x)<3) {
			   System.out.println(temp);
		    }
		    else if ((temp-x)>=3) {
			   System.out.println(x);
		    }
		}
		else{
			System.out.println(x);
		}
		
	}
}