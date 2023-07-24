package pradyut;


import java.util.*;

public class exception{
	public static void main(String args[]) {
		try {
			try {
				int a[]= {1,2,3};
				System.out.println(a[3]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e +":out of bounds");
			}
			System.out.println(4/0);
		}
			catch(ArithmeticException e) {
				System.out.println(e +":divide by zero");
			}
		}
	}
