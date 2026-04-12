// #PROBLEM: https://leetcode.com/problems/odd-even-linked-list/

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
}

public  class  OddEvenLinkedList {
    private static Node convertLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }

        return head;
    }

    private static void traversalLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 6, 4, 7};
        Node head = convertLL(arr);

        if(head == null || head.next == null){
            traversalLL(head);
        }

        Node evenHead = head.next;
        Node even = evenHead;
        Node odd = head;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        traversalLL(head);
    }
}


// Time complexity: O(n)
// Space complexity: O(1)