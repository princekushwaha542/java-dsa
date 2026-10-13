package linkedlist;

public class LinkedListImplementation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert node at the end
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

    // Display the linked list
    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Search for a value
    boolean search(int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {

        LinkedListImplementation list =
                new LinkedListImplementation();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List:");
        list.display();

        int key = 30;

        if (list.search(key)) {
            System.out.println(key + " found");
        } else {
            System.out.println(key + " not found");
        }
    }
}