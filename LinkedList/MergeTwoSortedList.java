
class Node {

    int data;
    Node next;

    Node(int d1, Node n1) {
        data = d1;
        next = n1;
    }
}

public class MergeTwoSortedList {

    private static Node convertLL(int[] arr) {
        Node head = new Node(arr[0], null);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }

        return head;
    }

    private static Node mergeSortedLL(Node h1, Node h2) {
        Node newNode = new Node(1, null);
        Node curr = newNode;
        Node t1 = h1;
        Node t2 = h2;

        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                curr.next = new Node(t1.data, null);
                curr = curr.next;
                t1 = t1.next;
            } else {
                curr.next = new Node(t2.data, null);
                curr = curr.next;
                t2 = t2.next;
            }
        }

        if (t1 != null) {
            curr.next = new Node(t1.data, null);
            curr = curr.next;
            t1 = t1.next;
        }

        if (t2 != null) {
            curr.next = new Node(t2.data, null);
            curr = curr.next;
            t2 = t2.next;
        }

        return newNode.next;
    }

    private static void traversalLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 4, 5, 6};
        int[] arr2 = {3, 3, 4, 5, 9};

        Node head1 = convertLL(arr1);
        Node head2 = convertLL(arr2);

        Node newNode = mergeSortedLL(head1, head2);
        traversalLL(newNode);
    }
}
