
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeSortedLinkedList {
    // Brute Force Approach: Merge and Sort
    // TC: O((n+m )log (m+n) ) SC: O(n+m)
    public static Node mergeBrute(Node list1, Node list2) {

        List<Integer> mergedValues = new ArrayList<>();

        Node current1 = list1;
        Node current2 = list2;

        // Store values from first list
        while (current1 != null) {
            mergedValues.add(current1.val);
            current1 = current1.next;
        }

        // Store values from second list
        while (current2 != null) {
            mergedValues.add(current2.val);
            current2 = current2.next;
        }

        // Sort values
        Collections.sort(mergedValues);

        // Create new linked list from sorted values
        Node dummy = new Node(-1);
        Node temp = dummy;

        for (int value : mergedValues) {
            temp.next = new Node(value);
            temp = temp.next;
        }

        return dummy.next;
    }

    // Optimal Approach: Merge in One Pass Using Two Pointers
    // TC: O(n+m) SC: O(1)
    public static Node mergeOptimal(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return dummy.next;
    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);
        list1.next.next.next = new Node(7);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);
        list2.next.next.next = new Node(8);

        Node mergedList = mergeBrute(list1, list2);
        System.out.println("Merged and Sorted List (Brute Force): ");
        printList(mergedList);

        Node mergedListOptimal = mergeOptimal(list1, list2);
        System.out.println("Merged List (Optimal): ");
        printList(mergedListOptimal);

    }
}
