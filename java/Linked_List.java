
public class Linked_List {


	  public static void main(String[] args) {
	    Node head=new Node();
	    head=head.addE(1);
	    head.addE(2);
	    head.addE(3);
	    head.addE(4);
	    head.addE(5);
	    head.printE();
	   head.deleteE(2);
	   head.printE();
	  }
	}

	class Node{
	  int data;
	  Node next;
	  Node(int data)
	  {
	    this.data=data;
	  }
	  Node(){}
	  Node addE(int data)
	  {
	    if(this==null)
	    {
	      return new Node(data);
	    }
	    else
	    {
	      Node curl=this;
	      while(curl.next!=null)
	      {
	        curl=curl.next;
	      }
	      curl.next=new Node(data);
	      return this;
	    }
	  }

	  void printE()
	  {Node curl=this;
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
	      Node pr=null;
	      while(curl!=null)
	      {
	        if(curl.data==data)
	        {
	          pr.next=curl.next;
	          curl=curl.next;
	        }
	        else
	        {
	          pr=curl;
	          curl=curl.next;
	        }
	      }
	      return this;
	    }
	  }
	}



