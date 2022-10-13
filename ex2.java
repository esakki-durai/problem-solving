class ex2 { 
    public static void main (String[] args) {
        String str="A1b2c3d4";
        System.out.println("Your entered string is,\t"+str);
        char[]  chars=str.toCharArray();
        for(char c:chars){
           System.out.print(c);}

int j= chars.length-1;
int i=0;
while(i<=j){
             while(i<j){
                     if((chars[i] >= 'a' && chars[i] <= 'z')||(chars[i] >= 'A' && chars[i]<= 'Z')){break;}
                     else{ i++;}}
             while(i<j){
                    if((chars[j] >= 'a' && chars[j] <= 'z')||(chars[j] >= 'A' && chars[j] <= 'Z')){
                           break;}
                    else{
                         j--;}
                            }

char temp=chars[i];
chars[i]=chars[j];
chars[j]=temp;
i++;
j--;
}
System.out.println("After   string");
for(i=0;i<chars.length-1;i++){
   System.out.print(chars[i]);}
    }
       }