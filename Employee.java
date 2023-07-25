package pradyut;
import java.util.*;
public class exam {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int Empid[]= {1001,1002,1003,1004,1005,1006,1007};
		String name[]= {"curry","klay","dray","wiggs","cp3","looney","gary"};
		char Empcode[]= {'e','f','g','h','i','j','k'};
		String designation[]= {"enginer","clerk","manager","HR","GM","frontdesk","PA"};
		String dept[]= {"r&d","chemical","mechanical","software","civil","IT","Gvt"};
		double HRA[]= {10000,20000,30000,40000,50000,60000,70000};
		double DA[]= {12000,22000,33000,44000,55000,66000,77000};
		double basic[]= {1000,2000,3000,4000,5000,6000,7000};
		double IT[]= {1500,2500,3500,4500,5500,6500,7500};
		System.out.println("enter employee id");
		int id=Integer.parseInt(args[0]);
		double salary;
		int flag=0;
		for(int i=0;i<Empid.length;i++)
		{
			if(id==Empid[i])
			{
				flag=1;
				System.out.println("employee id :"+Empid[i]);
				System.out.println("employee name :"+name[i]);
				System.out.println("employee department :"+dept[i]);
				switch(Empcode[i])
				{
				case 'e':	System.out.println("Designation:engineer");
							System.out.println("Da:12000");
							salary=12000+HRA[i]+basic[i]-IT[i];
							System.out.println("salary:"+salary);
							break;
				case 'f':	System.out.println("Designation:clerk");
				System.out.println("Da:22000");
				salary=22000+HRA[i]+basic[i]-IT[i];
				System.out.println("salary:"+salary);
				break;	
				case 'g':	System.out.println("Designation:manager");
							System.out.println("Da:32000");
							salary=32000+HRA[i]+basic[i]-IT[i];
							System.out.println("salary:"+salary);
							break;
				case 'h':	System.out.println("Designation:HR");
				System.out.println("Da:42000");
				salary=42000+HRA[i]+basic[i]-IT[i];
				System.out.println("salary:"+salary);
				break;
				case 'i':	System.out.println("Designation:GM");
				System.out.println("Da:52000");
				salary=52000+HRA[i]+basic[i]-IT[i];
				System.out.println("salary:"+salary);
				break;
				}
			}
		}
		if(flag==0)
		{		
			System.out.println("employee id not found");
		}
	}
}
