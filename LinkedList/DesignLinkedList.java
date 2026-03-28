// #PROBLEM: https://leetcode.com/problems/design-linked-list/

class Node {
    int data;
    Node next;

    Node(int d1, Node n1){
        this.data = d1;
        this.next = n1;
    }
}

public class DesignLinkedList {
    private static Node convertArrToLL(int[] arr){
        Node head = new Node(arr[0], null);
        Node temp = head;
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i], null);
            temp = temp.next;

            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    private static void traverseLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static int get(Node head, int index){
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            if(cnt == index){
                return temp.data;
            }
            cnt++;
            temp = temp.next;
        }
        return -1;
    }

    private static void addAtHead(Node head, int val){
        Node temp = new Node(val, head);
        // head = temp
        traverseLinkedList(temp);
    }

    private static void addAtTail(Node head, int val){
        if(head == null){
            Node temp = new Node(val, null);
            head = temp;
            traverseLinkedList(head);
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(val, null);
            traverseLinkedList(head);
        }
    }

    private static void addAtIndex(Node head, int index, int val){
        if(index < 0){
            return;
        }

        if(index == 0){
            Node temp = new Node(val, head);
            head = temp;
            traverseLinkedList(head);
            return;
        }

        int cnt = 0;
        Node temp = head;
        while(temp != null){
            if(cnt == index - 1){
                Node newNode = new Node(val, null);
                newNode.next  = temp.next;
                temp.next = newNode;
                traverseLinkedList(head);
                break;
            }
            cnt++;
            temp = temp.next;
        }
    }

    private static void deleteAtIndex(Node head, int index){
        if(index < 0 || head == null) {
            return;
        }
        if(index == 0){
            head = head.next;
            traverseLinkedList(head);
            return;
        }

        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            prev = temp;
            if(cnt == index -1){
                if(prev.next != null){
                    prev.next = prev.next.next;
                }
                traverseLinkedList(head);
                break;
            }
            cnt++;
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3};
        int val = 0;
        Node head = convertArrToLL(arr);

        int valueOfGet = get(head, 2);
        System.out.println(valueOfGet);

        // addAtHead(head, val);

        // addAtTail(head, val);
        // addAtIndex(head, 2, val);
        deleteAtIndex(head, val);
    }
}
