package pradyut;

public class methodoverloading {
public static int add(int a,int b)
{
	return a+b;
}
public static int  add(int a,int b,int c) {
	return a+b+c;
}
 public static float add(float a) {
	 return a*a;
 }
	public static void main(String args[]) {
		methodoverloading obj=new methodoverloading();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20, 30));
		System.out.println(obj.add(10.5f));
		
	}

}
