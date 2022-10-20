class EvenSort{
public static void main(String[] args) {
            int arr[][]={{-8,9,1,2},{5,7,2,7},{4,9,0,1},{7,-9,8,-2}};

            for(int i=0;i<arr.length;i++){
            	for(int j=0;j<arr[i].length;j++){
            		for(int k=0;k<arr[i].length-j-1;k++){

            			if((arr[i][k]>arr[i][k+1])&&(i%2==0)){
            				int t=arr[i][k];
            				arr[i][k]=arr[i][k+1];
            				arr[i][k+1]=t;    
            			}

            		                   }

            		}
            }
           for(int i=0;i<arr.length;i++){
            	for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");}
                System.out.println();

            	}



        }
}