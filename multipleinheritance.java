package pradyut;
import java.util.*;
interface one{
	void add(int a,int b);
}
interface two{
	void diffrence(int a,int b);
}
class ABC implements one,two{
	int sum;
	public void add(int a,int b)
	{
		sum=a+b;
		System.out.println("the sum is "+sum);
		
	}
	public void diffrence(int a,int b)
	{
		int diff=a-b;
		System.out.println("the diffrence is "+diff);
		
	}
}
public class multipleinheritance {
	public static void main(String args[]) {
		ABC obj=new ABC();
		
		obj.add(10,20);
		obj.diffrence(30,10);
	}
	}	

