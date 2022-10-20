import java.util.Scanner;
class PrintingString2 {
    public static void main(String[]  args) {
	String str = new Scanner(System.in).next();
               for(int x=0;x<str.length();x++){
                 if((str.charAt(x) >='a')&&(str.charAt(x) <='z')||(str.charAt(x) >='A')&&(str.charAt(x)<='Z')){
                        char z=str.charAt(x);
                        int y=x+1;
                       
                        int a=0,b,c;
                               while(y<str.length()&&(str.charAt(y)>='0')&&(str.charAt(y)<='9')){
                                 b=Integer.parseInt(String.valueOf(str.charAt(y)));
                                 a=a*10+b;
                                 y++;
                                        }
                       
                        for(int m=1;m<=a;m++){
                          System.out.print(z);}
                        
                         x=y-1;
                                                                                      }}
                                         
       }
}






