import java.util.Scanner;
class PrintingString {
    public static void main(String[]  args) {
	String str = new Scanner(System.in).next();
	for(int x=0;x<str.length();x+=2){
		for(int y=0;y<Integer.parseInt(String.valueOf(str.charAt(x+1)));y++)
		   System.out.print(str.charAt(x)); } 
    }	
}