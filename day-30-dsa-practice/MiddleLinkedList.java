class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleLinkedList {
    // Brute Force Approach: Two Passes
    // TC: O(n) SC: O(1)
    public static Node findMiddleBrute(Node head) {
        if (head == null) {
            return null;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        int middleIndex = count / 2;
        current = head;
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }
        return current;
    }

    // Optimal Approach: Fast and Slow Pointers
    // TC: O(n) SC: O(1)
    public static Node findMiddleOptimal(Node head) {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middleNode = findMiddleBrute(head);
        if (middleNode != null) {
            System.out.println("Middle Node (Brute Force): " + middleNode.data);
        } else {
            System.out.println("The linked list is empty.");
        }

        middleNode = findMiddleOptimal(head);
        if (middleNode != null) {
            System.out.println("Middle Node (Optimal): " + middleNode.data);
        } else {
            System.out.println("The linked list is empty.");
        }

    }
}
