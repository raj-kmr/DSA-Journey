// #PROBLEM: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
}

public class RemoveDuplicatesFromSortedList {
    private static Node convertLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp  = head;

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
        int[] arr = {1, 1, 2, 3, 3};

        Node head = convertLL(arr);

        Node temp = head;
        if(head == null){
            traversalLL(head);
        }


        while(temp.next != null){
            if(temp.data == temp.next.data){
                if(temp.next.next == null){
                    temp.next = null;
                    continue;
                }
                temp.next = temp.next.next;
                continue;
            }

            temp = temp.next;
        }

        traversalLL(head);
    }
}


// Time complexity: O(n)
// Space complexity: O(1)