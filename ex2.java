//input:A1b2c3d4
//output:d1c2b3A4
//this is  zoho second round probelm solving program.
//we have swap the first and last character if that both alphabet.
//then change a first or last character
class ex2 { 
    public static void main (String[] args) {
        String str="A1b2c3d4";
        System.out.println("Your entered string is,\t"+str);
        char[]  chars=str.toCharArray();//string is immutable so we change string into array.
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
