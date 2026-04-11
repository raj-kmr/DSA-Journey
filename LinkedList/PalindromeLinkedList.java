// #PROBLEM: https://leetcode.com/problems/palindrome-linked-list/description/

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
}

public class PalindromeLinkedList {
    private static Node convertToLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp = head;
        for(int i = 0; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }
        return head;
    }

    private static Node reverseLL(Node head){
        Node curr = head;
        Node prev =  null;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }


    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 1};

        Node head = convertToLL(arr);

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverseLL(slow.next);
        Node temp = head;

        while(newHead != null){
            if(temp.data != newHead.data){
                reverseLL(newHead);
                System.out.println(false);
                break;
            }
            temp = temp.next;
            newHead = newHead.next;
        }

        reverseLL(newHead);
        System.out.println(true);
    }
}