// Problem: https://leetcode.com/problems/middle-of-the-linked-list/description/

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
}

public class MiddleOfLinkedList {
    private static Node convertArrTOLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp = head;
        for(int i=1; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }

        return head;
    }

    private static Node midOfLL(Node head, int mid){
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt == mid+1){
                return temp;
            }
            temp = temp.next;
        }

        return temp;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArrTOLL(arr);

        int mid = arr.length / 2;
        Node middle = midOfLL(head, mid);

        while(middle != null){
            System.out.print(middle.data + " ");
            middle = middle.next;
        }
    }
}


// Time complexity = O(n)
// Space complextiy = O(1)