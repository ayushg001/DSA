package linked_list;

public class reverse {
      
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

        public void add(int data){
                Node newNode  = new Node(data);
                if(head==null){
                    head=newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
        }

        public void reverse(){
            Node prev = null;
            Node curr = head;
            Node next;
            System.out.println();
            while(curr!=null){
               next=curr.next;
               curr.next=prev;
               prev=curr;
               curr=next;
            }
            head = prev;
        }
        public void print(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print(" null");
        }

        public static void main(String[] args) {
            reverse ll = new reverse();
            ll.add(3);
             ll.add(2);
        ll.add(1);
        ll.add(0);
        ll.print();

        ll.reverse();
        ll.print();
        }
    
}
