/*This is a zoho probelm solving programming
input:5
output:
/*                      1
                  2     6
            3     7     10
      4     8     11    13
5     9     12    14    15
*/
class NumberPattern{
public static void main(String[] args){
      	int [] []arr=new int[5] [5];
                     int n=5;
                     int a=1;
                     int x=0;
                     int y=n-1;
                     while(a<=n){
                        int val=n-1;
                        arr[x][y]=a;
                        int t=y;
                        while(y<n-1){
                            int b=val+arr[x][y];
                            y++;
                            arr[x][y]=b;
                            val--;}
                            y=t;
                            x++;
                            y--;
                            a++;}
 for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(arr[i][j]!=0){
            if(arr[i][j]>9){
                System.out.print(arr[i][j]+"    ");}
            else{System.out.print(arr[i][j]+"     ");}}
        else{System.out.print("      ");}}
       System.out.println();}}}
