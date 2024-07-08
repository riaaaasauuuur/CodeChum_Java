package Data_Structures.Linked_Lists;

import java.util.Scanner;
public class deleting {
    public static Node deleteValue(Node head, int value) {
        while (head != null && head.data == value) {
            head = head.next;
        }
        if (head == null) return null;

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
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

        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of node 1: ");
        int value = scanner.nextInt();
        Node head = new Node(value);
        Node current = head;

        for (int i = 1; i < n; i++) {
            System.out.print("Enter the value of node " + (i + 1) + ": ");
            value = scanner.nextInt();
            current.next = new Node(value);
            current = current.next;
        }

        System.out.print("Linked List: ");
        printList(head);

        System.out.print("Enter the value to delete: ");
        int deleteValue = scanner.nextInt();
        head = deleteValue(head, deleteValue);

        System.out.print("Updated Linked List: ");
        printList(head);

        scanner.close();
    }
}
