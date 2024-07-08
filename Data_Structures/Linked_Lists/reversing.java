package Data_Structures.Linked_Lists;

import java.util.Scanner;
public class reversing {
    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode = null;
        
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        return prev;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
            if (head != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the linked list: ");
        int size = scanner.nextInt();

        Node head = null;
        Node current = null;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of element " + (i + 1) + ": ");
            int data = scanner.nextInt();
            if (head == null) {
                head = new Node(data);
                current = head;
            } else {
                current.next = new Node(data);
                current = current.next;
            }
        }

        System.out.print("\nLinked List before reversing: ");
        printList(head);

        head = reverseLinkedList(head);

        System.out.print("Linked List after reversing: ");
        printList(head);

        scanner.close();
    }
}
