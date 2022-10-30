//Tthis is zoho problem solving program
//input :4
/*
output:
4  4  4  4  4  4  4
4  3  3  3  3  3  4
4  3  2  2  2  3  4
4  3  2  1  2  3  4
4  3  2  2  2  3  4
4  3  3  3  3  3  4
4  4  4  4  4  4  4
*/
import java.util.Scanner;
class SquareNumPrint{
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
      	int [] []arr=new int[n*2] [n*2];
                     int m=(n*2)-1,first=0,last=m-1,x=0,y=m-1;
                     while(first<=last){
                        for(int i=x;i<=y;i++){for(int j=x;j<=y;j++){
                            if((i==first)||(j==first)||(i==last)||(j==last)){
                                arr[i][j]=n;}}}
                                x++;y--;n--;first++;last--;}
                    System.out.println("The Square Printing is:");
                    for(int i=0;i<m;i++){for(int j=0;j<m;j++){
                                System.out.print(arr[i][j]+"  ");}System.out.println();}}}
