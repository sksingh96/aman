/*
class Linked_List1
{

	public static void main(String[] a)
	{
		Node head=null;
		head=Node.addElement(head,2);
		Node.addElement(head,7);
		Node.addElement(head,6);
		Node.addElement(head,4);
        head.printE();
        head.deleteE(head, 2);
        head.printE();

        
	}
}
class Node
{
	int data;
	Node next;
	Node()
	{}
	Node(int data)
	{
		this.data=data;
	}
	public static Node addElement(Node head,int data)
	{
		if(head==null)
			return new Node(data);
		else
		{
			Node cur=head;
			while(cur.next!=null)
			{
				cur=cur.next;
			}
			cur.next=new Node(data);
			return head;
		}		
	}
	void printE()
	{
		Node cur=this;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
    }
    Node deleteE(Node head,int data)
    {
        Node curl=head;
        Node pre=null;
        if(curl.data==data)
        {
            return curl.next;
        }
        else
        {
            while(curl.next!=null)
            {
                if(curl.data==data)
                {
                    pre=curl.next;
                    curl=curl.next;
                }
                else
                {
                    pre=curl;
                    curl=curl.next;
                }
            }
        }
        return head;
    } 
}

												*/


class Linked_List1
{
    public static void main(String[] args) {
        Node head=new Node();
        head=head.addE(1);
        head.addE(2);
        head.addE(3);
        head.addE(4);
        head.printE();
        head.deleteE(0);
        head.printE();
       
    }
}
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
    Node()
    {}
    Node addE(int data)
    {
        Node curl=this;
        if(curl==null)
        {
            return new Node(data);
        }
        else
        {
            while(curl.next!=null)
            {
                curl=curl.next;
            }
            curl.next=new Node(data);
            return this;

        }
    }
    void printE()
    {
        Node curl=this;
        while(curl!=null)
        {
            System.out.println(curl.data+" ");
            curl=curl.next;
        }
    }
    Node deleteE(int data)
    {
        if(this.data==data)
        {
            return this.next;
        }
        else
        {
            Node curl=this;
            Node pre=null;
            while(curl.next!=null)
            {
                if(curl.data==data)
                {
                    pre=curl.next;
                    curl=curl.next;
                }
                else
                {
                    pre=curl;
                    curl=curl.next;
                }
            }
            return this;
        }
    }


}