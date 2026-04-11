// #PROBLEM: https://leetcode.com/problems/intersection-of-two-linked-lists/


class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
}

public class IntersectionOfLinkedList {
    private static Node convertToLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }

        return head;
    }

    private static void intersectList(Node t1, Node t2, int point){
        Node temp2 = t2;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        
        Node temp1 = t1;
        for(int i = 0; i < point; i++ ){
            temp1 = temp1.next;
        }
        temp2.next = temp1;
    }

    public static void main(String[] args){
        int[] arr1 = {1, 3, 5, 6, 7};
        int[] arr2 = {9, 2, 1};

        Node t1 = convertToLL(arr1);
        Node t2 = convertToLL(arr2);

        intersectList(t1, t2, 2);

        Node headA = t1;
        Node headB = t2;

        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;

            if(t1 == t2){
                System.out.println(t1.data);
            }

            if(t1 == null){
                t1 = headB;
            }

            if(t2 == null){
                t2 = headA;
            }
        }

        // System.out.println(t1.data);
    } 
}


// Time complextiy: O(n + m)
// Space complexity: O(1)
