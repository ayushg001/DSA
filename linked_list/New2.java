package linked_list;

class Node {
        int data;    // Value of the node
        Node next;   // Reference to the next node

        Node(int data){          // Constructor to create a new node
            this.data = data;
            this.next = null;
        }
    }

public class New2 {

    
    Node head;           // Head node of the linked list
    // public static Node tail; 

    public void addFirst(int data){
        //step 1  = create new node
            Node newNode = new Node(data);
            if( head ==null){
                head  = newNode;  
                return ;
            }
            //step 3
            newNode.next  = head ;  // Point new node to current head
            //step 3
            head =newNode;          // Move head to new node    
    } 
    public void addLast(int data){

        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node current = head ;        //current starts at the first node (head).
        while (current.next!=null) {
                   current= current.next;
        }
         current.next =  newNode ;
    }

    public void printLL(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
             temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        New2 ll = new New2();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLL();
    }
}
