package linked_list;

class Node {
    int data;
    Node next;  //// Stores reference (address) to the next node

    Node() {
    }

    Node(int d) {
        this.data = d;
        this.next = null;
    }

    Node insertEnd(Node head, int d) {
        Node newNode = new Node(d);      // creating new obj for new node
        if (head == null) {
            head = newNode;           // If there’s no first node yet , the new node becomes the first (head).
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    Node insertBeg(Node head , int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
        return head;
    }
    

    void display(Node head) {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}

public class New1 {
    public static void main(String[] args) {

        Node head = null;
        Node obj = new Node();
        head = obj.insertEnd(head, 11);
        head = obj.insertEnd(head, 22);
        head = obj.insertEnd(head, 33);
        head = obj.insertEnd(head, 44);
        obj.display(head);
    }
}
