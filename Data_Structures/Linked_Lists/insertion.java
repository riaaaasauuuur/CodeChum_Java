package Data_Structures.Linked_Lists;

import java.util.Scanner;

public class insertion{
    public static Node insertAtHead(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        return newNode;
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

        System.out.print("Enter the initial size of the linked list: ");
        int size = scanner.nextInt();

        Node head = null;
        Node current = null;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int data = scanner.nextInt();
            if (head == null) {
                head = new Node(data);
                current = head;
            } else {
                current.next = new Node(data);
                current = current.next;
            }
        }

        System.out.println("\nLinked List before head insertion:");
        printList(head);

        System.out.print("\nEnter the number of elements to insert at the front: ");
        int numInsert = scanner.nextInt();

        for (int i = 0; i < numInsert; i++) {
            System.out.print("Enter the value of element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            head = insertAtHead(head, value);
        }

        System.out.println("\nLinked List after head insertion:");
        printList(head);

        scanner.close();
    }
}