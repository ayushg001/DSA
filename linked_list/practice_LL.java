package linked_list;

public class practice_LL {

    class Node{

        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
       
    }
    Node head;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head=newNode ;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
       current.next= newNode;
    }
    public void add(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0 ;
        while( i <idx-1 ){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //remove
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if( size==1){
            head= null;
            size=0;
        }

        int val = head.data;
        head=head.next;
        size--;
        return val;
    }
    public void removeLast(){
        if( size==0){
            System.out.println("LL is already empty");
        } else if( size ==1){
            head= null;
            size=0;
        }
        Node temp = head;    
        for( int i = 0 ; i< size-2 ; i ++ ){
            temp = temp.next;
        }
        temp.next=null;
        size--;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
                temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        practice_LL ll = new practice_LL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
         ll.addLast(4);
         ll.add(5, 2);
         ll.add(0, 0);

        ll.print();
        System.out.println(ll.size);

        ll.removeFirst();
         ll.print();
        System.out.println(ll.size);

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}
