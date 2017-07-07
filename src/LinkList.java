/*
 * Here we are creating a application to implement Linked List without using collections.
 * here we are creating a class Link list
 */
public class LinkList {
//here  we taking the data type
	int x;  
	LinkList next=null;
	//here we are creating the constructor
	public LinkList(int x, LinkList next)
	{
	//here we are refrencing the variable	
	this.x = x;  
	this.next = next; 
	}
//here we are creating the main method
	public static void main(String[] args)
	{
		// here we are Creating the  objects  
		LinkList a = new LinkList(25, null); 
		LinkList b = new LinkList(47, null);
		LinkList c = new LinkList(14, null );
		LinkList d = new LinkList(30, null);
		LinkList e = new LinkList(60,null);

	 //here we are Taking the  next reference from the current node 
      // and makes it the current element.
     
	a.next = b;  
	b.next = c;
	c.next=d; 
	d.next = e;

	System.out.print("Linked list: ");
	//here we re applying the condition to 
	//Using pointer to refer the address of the next element in the list
	for(LinkList ptr = a; ptr!=null; ptr=ptr.next) 
	{
	System.out.print(ptr.x + " " );
	}
	
	}

	
	}

