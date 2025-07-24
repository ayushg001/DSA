package linked_list;

public class detect_cycle_in_LL {
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

    public boolean detect() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        detect_cycle_in_LL ll = new detect_cycle_in_LL();
        // ll.add(5);
        // ll.add(4);
        // ll.add(3);
        // ll.add(2);
        // ll.add(1);
        // ll.add(0);
        head = new Node(1);
        head.next =  new Node(2);
        head.next.next = new Node(3);
        head.next.next.next =  new Node(4);
        head.next.next.next.next = head;

        // ll.print();
        System.out.println("    size is : " + size);
        System.out.println(ll.detect());
    }
}
