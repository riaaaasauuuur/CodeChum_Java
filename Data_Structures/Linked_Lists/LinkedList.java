package Data_Structures.Linked_Lists;

public class LinkedList {
    public Node head;

    public void reverse() {
        // Implement me!
    }

    // ----- DO NOT MODIFY CODE BELOW -----
    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    public void displayLinkedList() {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.next != null) {
                System.out.print(currentNode.data + " -> ");
            } else {
                System.out.println(currentNode.data);
            }
            currentNode = currentNode.next;
        }
    }
}
