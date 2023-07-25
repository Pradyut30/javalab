package pradyut;
import java.util.Scanner;



import java.util.*;

public class uniquePassword {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String name;
		String pswd;
		long ph;
		int rno,rem,sum=0;
	
		System.out.println("Enter the name");
		name=sc.next();
		
		System.out.println("enter room no.");
		rno=sc.nextInt();
		
		System.out.println("enter phone rnober: ");
		ph=sc.nextLong();
		
		char sym[]= {'!','@','#','$','%','^','&','*'};
		while(rno>0||sum>9)
		{
			if(rno==0)
			{
				rno=sum;
				sum=0;
			}
			sum+=rno%10;
			rno/=10;
		}
		int len=name.length();
		Random ran= new Random();
		int ranindex= ran.nextInt(sym.length);
		char ranchar=sym[ranindex];
		System.out.println("Password is: ");
		pswd=""+name.charAt(0)+(ph%10)+sum+ranchar+name.charAt(len-1);
		System.out.println(pswd);
	}

}
