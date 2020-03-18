class DoublyList{
    public static void main(String[] args){
         Node1 head=new Node1();
         head=head.addE(1);
         head.addE(2);
         head.addE(3);
         head.addE(4);
         head.printE();
         head=head.deleteE(4);
         head.printE();
    }
}
class Node1{
    int data;
    Node1 bef;
    Node1 next;
    Node1(int data){
        this.data=data;
    }
    Node1(){}
    Node1 addE(int data){
        Node1 curl=this;
        if(curl==null){
            return new Node1(data);
        }
        else
        {
            while(curl.next!=null){
                curl=curl.next;
            }
            curl.next=new Node1(data);
            curl.next.bef=curl;
        }
        return this;
       }
    void printE(){
        Node1 curl=this;
        while(curl!=null){
            System.out.print(curl.data+" ");
            curl=curl.next;
        }
    }

   Node1 deleteE(int data){
       if(this.data==data){
           this.next.bef=null;
           return this.next;
       }
       else
       {
           Node1 prev=this;
           Node1 curl=this.next;

           while(curl!=null){
               if(curl.data==data){
                   prev.next=curl.next;
                   if(curl.next==null)
                    break;
                   curl.next.bef=curl.bef;
                   curl=curl.next;
                   
                  // System.out.println(curl.data);
               }
               else{
                   prev=curl;
                   curl=curl.next;                   
               }
           }

       }
       return this;
    }
}


