import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLinkedList {
    // Brute Force Approach:
    // TC: O(n) - We traverse the list to create the array and then check for
    // palindrome.
    // SC: O(n) - We use an array to store the values of the nodes
    public static boolean isPalindrome(Node head) {
        List<Integer> values = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            values.add(temp.data);
            temp = temp.next;
        }
        int left = 0, right = values.size() - 1;
        while (left < right) {
            if (!values.get(left).equals(values.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Optimal Approach:
    // TC: O(n) - We traverse the list to find the middle, reverse the second half,
    // and then compare the two halves.
    // SC: O(1) - We use a constant amount of space for the pointers
    public static boolean isPalindromeOptimal(Node head) {
        if (head == null || head.next == null)
            return true;

        // Step 1: Find the middle of the linked list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node curr = slow;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare the first half and the reversed second half
        Node left = head, right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        System.out.println("Input: head = [1, 2, 2, 1]");
        System.out.println("Output (Brute Force): " + isPalindrome(head));
        System.out.println("Output (Optimal): " + isPalindromeOptimal(head));
    }
}
