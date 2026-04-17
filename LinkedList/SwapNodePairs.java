// #Problem: https://leetcode.com/problems/swap-nodes-in-pairs/

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
}

public class SwapNodePairs {
    private static Node convertLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }

        return head;
    }

    private static Node swapNode(Node head){
        Node  dummy = new Node(0, head);
        Node curr = head;
        Node prev = dummy;

        while(curr != null && curr.next != null){
            Node nextNode = curr.next.next;
            Node second = curr.next;

            second.next = curr;
            curr.next = nextNode;
            prev.next = second;

            prev = curr;
            curr = nextNode;
        }

        return dummy.next;
    }

    private static void traverseLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        Node head = convertLL(arr);

        Node swaped = swapNode(head);

        traverseLL(swaped);
    }
}


// Time complextiy: O(n)
// Space complexity: O(1)