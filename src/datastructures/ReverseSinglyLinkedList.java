package datastructures;

public class ReverseSinglyLinkedList {

    /*
    5 -> 1 -> 18 -> 3 -> 13
    just reverse the pointers

    5 <- 1 <- 18 <- 3 <- 13
     */
    static void reversePrint(SinglyLinkedListNode head) {

        SinglyLinkedListNode current = head;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode nt = null;

        while (current != null) {
            nt = current.next;
            current.next = prev;
            prev = current;
            current = nt;
        }

        while ( prev != null) {
            System.out.println(prev.data);
            prev = prev.next;
        }
    }

}
    class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }
