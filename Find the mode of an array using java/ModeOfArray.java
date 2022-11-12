//Find the modenumber of an array.modenumber means most repeated value
//outpput: The mode of array is: 3
class ModeOfArray{
public static void main(String[] args) {
	int n=5,a[]={2,4,3,1,3},count,topvalue=0,topcount=0;
	for(int i=0;i<n;i++){
		count=0;
		for(int j=i+1;j<n;j++){
			if(a[i]==a[j]){
				count++;}
			if(topcount<count){
				topcount=count;
				topvalue=a[j];}}} 
    System.out.println("The mode of array is:   "+topvalue);}}
