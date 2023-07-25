package pradyut;
import java.util.*;
public class binarysearch {
	
	public static void binsearch(int arr[], int first, int last, int x) {
		
		int mid=(first+last)/2;
		
		while(first<=last)
		{
			if(x>arr[mid])
			{
				first=mid+1;
			}
				
			else if(arr[mid]==x)
			{
				System.out.println("Element "+ x + " found at index ["+mid+"]");
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last)
			System.out.println("element not found :/ ");
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("array elements after sorting: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("enter the search element: ");
		int x=sc.nextInt();
		int last=n-1;
		binsearch(arr,0,last,x);
	}

}
