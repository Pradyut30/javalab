package pradyut;
import java.util.*;
public class dsum {
	public static void digitsum(int num)
	{
		int sum=0;
		while(num>0||sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("the sum is"+sum);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two digit number:");
		int n=sc.nextInt();
		dsum obj=new dsum();
		obj.digitsum(n);
	}
	
}
