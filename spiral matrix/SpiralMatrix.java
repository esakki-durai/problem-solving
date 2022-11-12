public class SpiralMatrix{
    public static void main(String[] args) {
      int a[][]={{1,2,3,4},{14,15,16,5},{13,20,17,6},{12,19,18,7},{11,10,9,8}};
      int rs=0,re=a.length,cs=0,ce=a[0].length;
      while(rs < re && cs < ce)
      {
         for(int i=cs;i<ce;i++){System.out.print(a[rs][i]+ " ");}rs++;
         for(int i=rs;i<re;i++){System.out.print(a[i][ce-1]+" ");}ce--;
         for(int i=ce-1;i>=cs;i--){System.out.print(a[re-1][i]+" ");}re--;
         for(int i=re-1;i>=rs;i--){System.out.print(a[i][cs]+" ");}cs++;
      }
       }}