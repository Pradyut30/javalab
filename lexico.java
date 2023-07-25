package pradyut;
import java.util.Arrays;
import java.util.Scanner;

public class lexico {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String []ls=new String[5];
		System.out.println("enter the 5 strings");
		ls[0]=sc.next();
		ls[1]=sc.next();
		ls[2]=sc.next();
		ls[3]=sc.next();
		ls[4]=sc.next();
		
		int i=0;
		System.out.println("the order is "+"\n");
		for(i=0;i<5;i++)
		{
			System.out.print(ls[i] +',');
		}
		Arrays.sort(ls);
		System.out.println("the lexico order is:");
		for(i=0;i<5;i++)
		{
			System.out.print(ls[i] +',');
		}
	}

}
