package linked_list;

public class find_remove_nth_node {
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
                    size++;
                    return;
                }
                newNode.next = head;
                head = newNode;
                size++;
        }
        public void remove(int n){
            Node temp=head;
            int sz = 0;
            while(temp!=null){
                temp = temp.next;
                sz++;
            }
            if(n ==sz){
                head= head.next;
                return;
            }
            int i = 1;
            Node prev = head;
            while( i < sz-n){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
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
        find_remove_nth_node ll = new find_remove_nth_node();
        ll.add(5);
        ll.add(4);
            ll.add(3);
             ll.add(2);
        ll.add(1);
        ll.add(0);
        ll.print();
        System.out.println("    size is : " +size);

        ll.remove(1);
        ll.print();
        // System.out.println("    size is : " +size);
    }
}
