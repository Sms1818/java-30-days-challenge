class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class RemoveNthNodeFromEnd {
    // TC: O(n) - We traverse the list twice (once to find the length and once to remove the node).
    // SC: O(1) - We use a constant amount of space for the pointers.
    public static Node removeNthFromEnd(Node head, int n) {
        if(n <= 0) return head;
        Node temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(n>length) return head;
        if(n==length) return head.next;
        temp=head;
        for(int i=1;i<length-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int n = 2;
        System.out.println("Input: head = [1, 2, 3, 4, 5], n = 2");
        Node result = removeNthFromEnd(head, n);
        System.out.print("Output: [");
        while (result != null) {
            System.out.print(result.data);
            if (result.next != null) {
                System.out.print(", ");
            }
            result = result.next;
        }
        System.out.println("]");
    }
}
