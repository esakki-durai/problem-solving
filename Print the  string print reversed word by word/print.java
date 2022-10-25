import java.io.*;
import java.util.*;
class print{
	public static void main(String[] args) {
		String str=new Scanner(System.in).nextLine();
		Stack<Character> es=new Stack<Character>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				es.push(str.charAt(i));}
			else{
				while(es.empty()==false){
					System.out.print(es.pop());}System.out.print(" ");}
			}
			while(es.empty()==false){
					System.out.print(es.pop());}		
		
	}
}