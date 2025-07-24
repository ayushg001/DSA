package linked_list;

import java.util.LinkedList;

public class pallindrome {
     static class Node {
        int data;
     Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    public static int size;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(" null");
    }
    public Node findMid(Node head){        //slow - fast approach
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;          //slow is the mid node
    } 
    public boolean pal(){
        if( head == null || head.next==null){
            return true;
        } //step 1 - find mid
        Node midNode =   findMid(head);
        //step2 - reverse
        Node prev = null;
        Node curr = midNode;
        Node next;
        while ( curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        Node right = prev ; // right half head
        Node left = head; // left half head
        //step 3 = check  left half and right half
        while( right!= null){
            if(left.data!= right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        pallindrome ll = new pallindrome();
        //  ll.add(5);
        // ll.add(4);
        // ll.add(3);
        ll.add(0);
        ll.add(1);
        ll.add(0);
        ll.print();
        
        // LinkedList<Integer> ll =  new LinkedList<>();
        // ll.addFirst(0);
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // System.out.println(ll);
        System.out.println(ll.pal());
    }
}
