
class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
// Node head;

// }
// public int get(int index){
//     int cnt = 0;
//     Node temp = head;
//     while(temp != null){
//         if(cnt == index){
//             return temp.data;
//         }
//         temp = temp.next;
//     }
//     return -1;
// }
public class LinkedList {

    private static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]); // [2, null];
        Node temp = head; // temp = [2, null]
        Node mover = head;
        for (int i = 1; i < arr.length; i++) { // 4 -> 5 -> 7
            // Temp works as Node creator
            temp.next = new Node(arr[i]); // temp.next = null, create Node(4) -> [4, null]
            temp = temp.next; // temp = [4, null]; 

            // mover works as Node connector
            mover.next = temp; // [2, next] -> [4, null];
            mover = temp; // mover = [4, null];
        }
        return head;
    }

    private static void traverseLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static int lenghtOfLL(Node head){
        Node temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        return cnt;
    }

    private static boolean checkIfPresent(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7};
        int val = 10;
        // Convert array to Linked list //
        Node head = convertArrToLL(arr);

        // Traversing the linked list //
        System.out.print("Linked List: ");
        traverseLL(head);

        // Length of the Linked List //
        System.err.println("\nLength of the linked list: " +lenghtOfLL(head));

        // Check if some value present //
        System.err.println("Is the number " + val + " Present: " + checkIfPresent(head, val));


        // Create a single Node with null pointer // 
        // Node n = new Node(arr[2]);
        // System.out.println(n.data);
    }

}
