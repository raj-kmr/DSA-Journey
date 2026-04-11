// #PROBLEM: https://leetcode.com/problems/remove-linked-list-elements/description/

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
}

public class RemoveListElements {
    private  static Node convertLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }

        return head;
    }

    private static void traversalLL(Node head){
        Node temp = head;
        while(temp != null){
            System.err.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        int val = 6;
        Node head = convertLL(arr);

        Node prev = new Node(1, head);
        Node curr = head;
        Node newHead = prev;

        while(curr != null){
            if(curr.data == val){
                Node temp = curr.next;
                curr.next = null;
                curr = temp;
                prev.next = curr;
            } else {
                curr = curr.next;
                prev = prev.next;
            }
        }

        newHead = newHead.next;
        traversalLL(newHead);
    }
}


// Time complexity: O(n)
// Space complexity: O(1)