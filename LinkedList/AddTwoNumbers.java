// #PROBLEM: https://leetcode.com/problems/add-two-numbers/description/

class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
}

public  class AddTwoNumbers {
    private  static Node convertLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp  = head;
        for(int i=1; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;
        }
        return head;
    }

    private static  Node addNumbers(Node h1, Node h2){
        Node t1 = h1;
        Node t2 = h2;
        Node dummyNode = new Node(1, null);
        Node curr = dummyNode;
        int carry = 0;
        while(t1 != null || t2 != null){
            int sum = carry;
            if(t1 != null){
                sum += t1.data;
            }
            if(t2 != null){
                sum+= t2.data;
            }

            Node newNode = new Node(sum %10, null);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;

            if(t1 != null){
                t1 = t1.next;
            }
            if(t2 != null){
                t2 = t2.next;
            }
        }

        if(carry != 0){
            Node newNode = new Node(carry, null);
            curr.next = newNode;
        }

        return dummyNode.next;
    }

    private static  void traversalLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


    public static  void main(String[] args){
        int[] arr1 = {2, 3, 5};
        int[] arr2 = {4, 5, 7};

        Node head1 = convertLL(arr1);
        Node head2 = convertLL(arr2);

        Node newHead = addNumbers(head1, head2);

        traversalLL(newHead);
    }
}

// Time complextiy: O(max(n, m))
// Space complextiy: O(max(n, m))