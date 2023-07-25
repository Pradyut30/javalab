package pradyut;

import java.util.Scanner;

public class squares{
 
	
	public static void main(String[]args){
		int n;
		
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of squares");
		n=s.nextInt();
		if(n<=0)
		{
			System.out.println("invalid input");
			
		}
		else
		{
		   int sum=0;
		   int i=1;
		   while(n>0)
		   {
			   sum+=n*n;
			   int temp=n*n;
			   System.out.println("the number of matrix for "+i+'*'+i);
			   System.out.println("matrix are"+n*n);
			   n--;
			   i++;
		   }
		   System.out.println("the total matrix is "+sum);
		}
	}
}
