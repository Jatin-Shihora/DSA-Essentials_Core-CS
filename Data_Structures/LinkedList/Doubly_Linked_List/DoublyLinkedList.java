import java.util.Scanner;

// this node class is been used to create nodes of doubly linked list
class Node {
    int info;
    Node next;
    Node prev;

    Node(int info) {
        this.info = info;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    Scanner sc = new Scanner(System.in);
    static Node head;

    // used to create list 
    void create(int n) {
        Node temp, p;
        int i=1;
        if(head==null) {
        	System.out.println("Enter the data : ");
        	int info = sc.nextInt();
        	temp = new Node(info);
        	head = temp;
        	head.next=null;
        	head.prev=null;
        	
        	while(i<n) {
        		System.out.println("Enter the data : ");
            	int info2 = sc.nextInt();
            	p = new Node(info2);
            	temp.next=p;
            	p.prev=temp;
            	temp=temp.next;
            	i++;
            }
        } 
        else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            while (i <= n) {
                System.out.println("Enter the data : ");
                int info2 = sc.nextInt();
                p = new Node(info2);
                temp.next = p;
                temp = temp.next;
                i++;

            }
        }

    }

    // used to display list
    public static void display()
	{
	    Node temp=head;
	    System.out.print("Null<-->");
		while(temp!=null)
		{
			System.out.print(temp.info+"<--->");
			temp=temp.next;
		}
		System.out.println("Null");
	}

    // used to count the total no. of elements of list
    void count() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        System.out.println("Total no. of elements: "+i);
    }

    // used to add a new node at front of list
    public static void addFront()
	{
		System.out.println("Enter data");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		
		Node n=new Node(d);
		
		if(head==null)
		{
			head=n;
		}
		else
		{
		    n.next=head;
		    head.prev=n;
		    head=n;
		}
	}
	
    // used to add new node at end of list
	public static void addLast()
	{
		System.out.println("Enter data");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		Node n=new Node(d);
		if(head==null)
		{
			head=n;
		}
		else
		{
		    Node temp=head;
		
		    while(temp.next!=null)
			    temp=temp.next;
		
		    temp.next=n;
		    n.prev=temp;
		}
	}

    // used to add new node at any position in the list
	public static void addAtNth()
	{
		System.out.println("Enter data");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		System.out.println("Enter position");
		int p=sc.nextInt();
		Node n=new Node(d);
		
		Node temp=head;
		int i=1;
		while(i<p-1)
		{
			i++;
			temp=temp.next;
		}
		Node y=temp.next;
		temp.next=n;
		n.prev=temp;
		n.next=y;
		y.prev=n;
	}
	
    // used to delete node from front of the list
	public static void delFirst()
	{
	    if(head==null)
	        System.out.println("empty");
	    else
	    {
	        head=head.next;
	        head.prev=null;
	    }
	}
	
    // used to delete node from end of the list
	public static void delLast()
	{
	     if(head==null)
	        System.out.println("empty");
	     else if(head.next==null)
	     {
	         head=null;
	     }
	    else
	    {
	        Node temp=head;
	        while(temp.next.next!=null)
	            temp=temp.next;
	        Node x=temp.next;
	        temp.next=null;
	        x.prev=null;
	    }
	}
	
    // used to delete node at any position in list
	public static void delAtNth()
	{
	    System.out.println("Enter position");
	    Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		
		Node temp=head;
		int i=1;
		while(i<p-1)
		{
			i++;
			temp=temp.next;
		}
		Node x=temp.next;
		Node y=x.next;
		temp.next=y;
		y.prev=temp;
		x.prev=null;
		x.next=null;
	}
    
    // used to search any node in the list
    void search() {
        Node temp = head;
        System.out.println("Enter data to be searched:");
        int n=sc.nextInt();
        int count=0;
        while (temp != null) {
        	count++;
            if (n == temp.info) {
                System.out.println("Found at position no. "+count);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found!!!");
    }
    
    // used to reverse the list
    static void reverse()
	{
	    Node curr=head,prev=null,temp;
	    while(curr.next!=null)
	    {
	        temp=curr.next;
	        curr.next=prev;
	        prev=curr;
	        curr=temp;
	    }
	    curr.next=prev;
	    head=curr;
	}
    
    //main function (it contatins menu of the program)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList obj = new DoublyLinkedList();
       
        
        System.out.println("*******************************************************");
        System.out.println("**********MENU**********");
        System.out.println("1.Create");
        System.out.println("2.Display");
        System.out.println("3.Count");
        System.out.println("4.Add Node at Front");
        System.out.println("5.Add Node at Last");
        System.out.println("6.Add Node at Any Position");
        System.out.println("7.Delete Node from Front");
        System.out.println("8.Delete Node from Last");
        System.out.println("9.Delete Node from Any Position");
        System.out.println("10.Search Any Node");
        System.out.println("11.Reverse the List");
        System.out.println("********************************************************");
        System.out.println("Enter Your Choice : ");
        int n = sc.nextInt();
        while (n != 0) {
            switch (n) {
                case 1:
                    System.out.println("Enter the number of elements: ");
                    int num = sc.nextInt();
                    obj.create(num);
                    break;
                case 2:
                    display();
                    break;
                case 3:
                	obj.count();
                    break;
                case 4:
                    addFront();
                    break;
                case 5:
                	addLast();
                	break;
                case 6:
                	addAtNth();
                	break;
                case 7:
                	delFirst();
                	break;
                case 8:
                	delLast();
                	break;
                case 9:
                	delAtNth();
                	break;
                case 10:
                	obj.search();
                case 11:
                	reverse();
                	break;
                default :
                    System.out.println("Please Enter valid Input !!!!!");
                    

            }
            
            System.out.println("*******************************************************");
            System.out.println("**********MENU**********");
            System.out.println("1.Create");
            System.out.println("2.Display");
            System.out.println("3.Count");
            System.out.println("4.Add Node at Front");
            System.out.println("5.Add Node at Last");
            System.out.println("6.Add Node at Any Position");
            System.out.println("7.Delete Node from Front");
            System.out.println("8.Delete Node from Last");
            System.out.println("9.Delete Node from Any Position");
            System.out.println("10.Search Any Node");
            System.out.println("11.Reverse the List");
            System.out.println("********************************************************");
            System.out.println("Enter Your Choice : ");
            n = sc.nextInt();
            
         }

    }

}

