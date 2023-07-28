import java.util.*;  
public class c2{  
 public static void main(String args[]){ 
 Scanner sc = new Scanner(System.in); 
  ArrayList<String> list=new ArrayList<String>();
  for(int i=0;i<6;i++){
    list.add(sc.nextLine());
  }
  for(int i=0;i<list.size() - 1;i++){
    if (list.get(i).equals(list.get(i+1))) {
      list.remove(i+1);
      i--;
    }
  } 
  for(String name: list)
        {
            System.out.print(name + " ");
        } 
  
 }  
}  