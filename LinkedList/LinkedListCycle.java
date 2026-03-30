// Problem: https://leetcode.com/problems/linked-list-cycle/description/


class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
}

public class LinkedListCycle {
    private static  Node convertToLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp = head;
        for(int i = 0; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }
        // pointing it back to create the cycle
        temp.next = head;

        return head;
    }

    private static  boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5,7};

        Node head = convertToLL(arr);
        boolean answer = hasCycle(head);

        System.out.println(answer);
    }
}


// Time complexity: O(n)
// Space compexity: O(1)