public class LinkedList {
    //linear datatype
    //dynamic memory
    //contains nodes, each nose has data and pointer of next node
    //types
        //singly LinkedList
        //doubly LinkedList
        //circular LinkedList
    // head:-
    
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //head and tail are created when LinkedList object is created
    public static Node head; 
    public static Node tail;


    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }


    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=null;
    }


    public void add(int data, int idx){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
    }

    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);//it will print the last node data which is null

    }


    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addFirst(1); 
        l1.addFirst(2);


    }
}
