// Problem: https://leetcode.com/problems/rotate-list/


class Node {
    int data;
    Node next;

    Node (int d1, Node n1){
        data = d1;
        next = n1;
    }
}

public class RotateLinkedList {
    private static Node convertLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }

        return head;
    }

    private static Node rotateList(Node head, int k){
        if(head == null || head.next == null){
            return head;
        }

        Node temp = head;
        int len = 1;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        Node tail = temp;
        k = k % len;
        if(k == 0){
            return head;
        }

        tail.next = head;
        Node newNode = head;
        int cnt = 0;
        while(newNode != null){
            if(cnt == (len - k)){
                head = newNode.next;
                newNode.next = null;
                break;
            }
            cnt++;
            newNode = newNode.next;
        }


        return head;
    }

    private static void traverseLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        Node head = convertLL(arr);

        Node rotate = rotateList(head, k);

        traverseLL(rotate);
    }
}


// Time complexity: O(n)
// Space complexity: O(1)