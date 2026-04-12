// # PROBLEM: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
}

public class RemoveNthNodeFromEnd {
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

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int val = 2;

        Node head = convertLL(arr);

        if(head.next == null){
            head = null;
        }

        Node temp  = head;
        int listlength = 0;

        while(temp != null){
            listlength++;
            temp = temp.next;
        }

        int d = listlength - val;
        temp = head;
        if(d == 0){
            temp = head.next;
            head = null;
            traversalLL(temp);   
        }

        int cnt = 0;

        while(temp != null){
            cnt++;
            if(cnt == d){
                temp.next = temp.next.next;
                traversalLL(head);
                break;
            }
            temp = temp.next;
        }
    }
}


// Time Complextiy: O(N)
// Space complexity: O(1)