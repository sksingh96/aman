class Testing
{
    public static void main(String[] args) {
        Node head=new Node();
        head=head.addE(1);
        head.addE(2);
        head.addE(3);
        head.addE(4);
        head.printE();
        head.deleteE(2);
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
            System.out.print(curl.data+" ");
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
	
	void reverse()
	{
		Node curl=this;
	while(curl.next!=null)
	{
		curl=curl.next;
	}		
		3
	}


}