import java.util.*;
class c42{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String word = sc.nextLine();
		rs(s1,word);
	}
	public static void rs(String s1,String word){
		String msg[] = s1.split(" ");
		String ns1 ="";
		for(String words:msg){
			if(!(words.equals(word))){
				ns1 += words+" ";
			}
		}
		System.out.println(ns1);
	}
}		