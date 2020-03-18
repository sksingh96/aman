class Linklist_Inner
{
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
        Node()
        {}
    }
     Node head;
    void addE(int data)
    {
        if(head==null)
        {
            head=new Node(data);
        }
        else{
            Node curl=head;
            while(curl.next!=null)
            {
                curl=curl.next;
            }
            curl.next=new Node(data);

        }
    }
    void printE()
    {
        Node curl=head;
        while(curl!=null)
        {
            System.out.print(curl.data+" ");
            curl=curl.next;
        }
    }   
    void deleteE(int data)
    {
        if(head.data==data)
        {
            head=head.next;
        }
        else{
            Node curl=head;
            Node pre=null;
            while(curl!=null)
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
    }
    public static void main(String[] args) {
        Linklist_Inner l=new Linklist_Inner();
        l.addE(1);
        l.addE(2);
        l.addE(3);
        l.addE(4);
        l.printE();
        l.deleteE(2);
        l.printE();
    }
}