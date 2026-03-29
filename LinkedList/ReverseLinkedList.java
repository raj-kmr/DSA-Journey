// #PROBLEM: https://leetcode.com/problems/reverse-linked-list/description/

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
}

public class ReverseLinkedList {
    private static  Node convertToLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp = head;
        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return head;
    }

    private static Node reverseLinkedList(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        Node temp = prev;
        System.err.println("");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return prev;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};

        Node head = convertToLL(arr);
        reverseLinkedList(head);
    }
}


// Time complexity: O(n)
// Space complexity: O(1)