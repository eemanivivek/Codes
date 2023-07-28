import java.util.*;
class c1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		String r = "this is this";
        System.out.println("The string to check the 2nd occurrance and the count is: "+r);
        char ar[] = r.toCharArray();
        char x = 'i';
        int so ;
		for(int i=0;i<ar.length;i++){
                    if (ar[i]==x){
                    	count++;
                    	if (count==2) {
                    		so = i;
                    	System.out.println("The Character 2nd occurrence at: "+so);
                    	
                    } 

                    }
                    
                    
                }
        System.out.println("Number of times the Character occur in the string: "+count);  
                 
	}
}