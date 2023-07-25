package pradyut;
import java.util.*;
public class matrix_addition {
	public void sum(int array1[][],int array2[][],int m,int n)
	{
		int res[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				res[i][j]=array1[i][j]+array2[i][j];
			}
		}
		System.out.println("the resultant matrix after addition is");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(res[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
	}
	public static void main(String args[]) {
		int rows,columns;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		rows=sc.nextInt();
		System.out.println("enter the number of colums");
		columns=sc.nextInt();
		int array1[][]=new int[rows][columns];
		int array2[][]=new int[rows][columns];
		System.out.println("enter the array 1 elements");
		for(int x=0;x<rows;x++)
		{
			for(int y=0;y<columns;y++)
			{
				array1[x][y]=sc.nextInt();
			}
		}
		System.out.println("enter the array 2 elements");
		for(int x=0;x<rows;x++)
		{
			for(int y=0;y<columns;y++)
			{
				array2[x][y]=sc.nextInt();
			}
		}
		matrix_addition ob=new matrix_addition();
		ob.sum(array1,array2,rows,columns);
	}
}
