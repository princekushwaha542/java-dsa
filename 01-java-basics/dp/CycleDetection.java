package linkedlist;

public class CycleDetection {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        CycleDetection list = new CycleDetection();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Create a cycle: 40 -> 20
        Node second = list.head.next;
        Node last = list.head.next.next.next;
        last.next = second;

        if (list.hasCycle()) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}