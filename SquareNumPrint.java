//Tthis is zoho problem solving program
//input :4
/*
C:\Users\ELCOT\Documents\probelm-solving>javac SquareNumPrint.java

C:\Users\ELCOT\Documents\probelm-solving>java SquareNumPrint
4  4  4  4  4  4  4
4  3  3  3  3  3  4
4  3  2  2  2  3  4
4  3  2  1  2  3  4
4  3  2  2  2  3  4
4  3  3  3  3  3  4
4  4  4  4  4  4  4
*/
class SquareNumPrint{
public static void main(String[] args){
int [] []arr=new int[8] [8];
int n=4;
int m=(n*2)-1;
int first=0;
int last=6;
int x=0;
int y=6;
while(first<=last){
for(int i=x;i<=y;i++){
   for(int j=x;j<=y;j++){
      if((i==first)||(j==first)||(i==last)||(j==last)){
            arr[i][j]=n;}}}
x++;
y--;
n--;
first++;
last--;
}
for(int i=0;i<m;i++){
  for(int j=0;j<m;j++){
     System.out.print(arr[i][j]+"  ");}
     System.out.println();}}}
