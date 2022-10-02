import java.util.Scanner;


// It will create nodes for stack.
class Stack
{
	int data;
	Stack next;
	Stack(int data)
	{
		this.data=data;
		next=null;
		
	}
}

public class StackUsingLL {
	
	static Stack head=null;


    // The following code will be used to push data in stack
	static void InsBeg()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element");
		int d=sc.nextInt();
		Stack p=new Stack(d);
		
		if(head==null)
		{
			head=p;
		}
		else
		{
			p.next=head;
			head=p;
		}
	}


    // The following code will use to pop data
	static void DelBeg()
	{
		if(head==null)
		{
			System.out.println("Stack Empty already-Underflow");
		}
		else
		{
			
			head=head.next;
		}
	}
	

    // The following code will be used to display stack data
	static void display()
	{
		Stack temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}

    // Main function contains Menu for performing above functions
	public static void main(String[] args) {
	
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println();
			System.out.println("1 InsBeg 2 DelBeg 3 Display");
			System.out.println("enter choice");
			int choice= sc.nextInt();
			switch(choice)
			{
			case 1:
					InsBeg();  //push function
					break;
			case 2:
					DelBeg();  //pop function
					break;
			case 3: 
					display();  //display function
					break;
			case 4:
					System.exit(0);  // Can be used to get out of this Menu
			}
		}

		
	}

}