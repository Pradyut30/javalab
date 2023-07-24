package pradyut;

public class doublell {
	class node{
		int data;
		node next;
		node prev;
		public node(int data)
		{
			this.data=data;
		}
	}
	node head=null;
	public void insert(int data)
	{
		node newnode=new node(data);
		newnode.next=head;
		newnode.prev=null;
		if(head!=null)
		{
			head.prev=newnode;
		}
			head=newnode;
		
	}
	public int min()
	{
		int min;
		node current=head;
		if(head==null)
		{
			System.out.println("no lement in the list");
			return 0;
			
		}
		else
		{
			min=current.data;
			while(current!=null)
			{
				if(min>current.data)
				{
					min=current.data;
				}
				current=current.next;
			}
		}
		return min;
	}
	public int max()
	{

		int max;
		node current=head;
		if(head==null)
		{
			System.out.println("no lement in the list");
			return 0;
			
		}
		else
		{
			max=current.data;
			while(current!=null)
			{
				if(current.data>max)
				{
					max=current.data;
				}
				current=current.next;
			}
		}
		return max;
	
	}
public static void main(String args[])
{
	doublell ob=new doublell();
	ob.insert(10);
	ob.insert(100);
	ob.insert(1);
	ob.insert(1000);
	ob.insert(100000);
	ob.insert(10000);
	
	System.out.println("the min element in the list is"+ob.min());
	System.out.println("the max element in the list is"+ob.max());
	
}
}
