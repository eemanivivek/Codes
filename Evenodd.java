Import java.util.Scanner; 
class Evenodd 
{ 
 public static void main(String args[]) 
 { 
  Scanner s = new Scanner(System.in); 
  int x; 
  System.out.println("Enter Number "); 
x=s.nextInt(); 
  if( x % 2 == 0) 
   System.out.println(x + "is even"); 
  else 
   System.out.println(x + "is odd"); 
 } 
}   
