//factorial of the given number 
//input:1   output:1
//input:5   output:720
import java.util.Scanner;
class FactNum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to get factorial");
int num=sc.nextInt();
int f=1;
while(num >=1){
       f=f*num;
       num--;}
System.out.println(f);
       }
}
