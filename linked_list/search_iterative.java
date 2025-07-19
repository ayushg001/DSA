package linked_list;

public class search_iterative {
    
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
        public void print(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print(" null");
        }
        public int search(int key){
            Node temp = head;
            int i =0;
            while(temp!=null){ 
                    if(temp.data==key){
                        return i;
                    }
                   temp= temp.next;
                    i++;
            }
            return -1;
        }
    
    public static void main(String[] args) {
        search_iterative ll = new search_iterative();
        ll.add(2);
        ll.add(1);
        ll.add(0);
        ll.print();
       System.out.println(ll.search(2));

    }
}
