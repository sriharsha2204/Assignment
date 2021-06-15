public class twoDim{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{11,22,33},{44,55,66},{77,88,99}};    
int b[][]={{1,2,3},{4,5,6},{7,8,9}};    
    
//creating another matrix to store the sum of two matrices    
int sum[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<=2;i++){    
for(int j=0;j<=2;j++){    
sum[i][j]=a[i][j]+b[i][j];    
System.out.print(sum[i][j]+" ");    
}    
System.out.println();//new line    


}
	}

}