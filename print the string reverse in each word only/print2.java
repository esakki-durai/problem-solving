import java.io.*;
import java.util.*;
class print2{
	public static void main(String[] args) {
		String str="Hello esakki durai";
		int i=0,j=0,k=0;
		while(i<str.length()){
			if(str.charAt(i)==' '|| str.charAt(i)==str.charAt(str.length()-1)){
				k=i;
				while(k>=j){
					System.out.print(str.charAt(k));
					k--;}System.out.print(" ");
				j=i+1;
				i++;}
			else i++;}
}}
		
		