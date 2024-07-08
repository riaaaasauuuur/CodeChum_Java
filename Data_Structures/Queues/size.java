package Data_Structures.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class size{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

            System.out.println("Options:");
            System.out.println("1 - Add an element to the queue");
            System.out.println("2 - Remove an element from the queue");
            System.out.println("3 - Count elements in the queue");
            System.out.println("4 - Exit the program");
        
        int option;
        do {
          
            System.out.print("\nEnter your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    int elementToAdd = scanner.nextInt();
                    queue.add(elementToAdd);
                    System.out.println("Element " + elementToAdd + " has been added to the queue.");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        int removedElement = queue.poll();
                        System.out.println("Removed element: " + removedElement);
                    } else {
                        System.out.println("Queue is empty. Cannot remove element.");
                    }
                    break;
                case 3:
                    System.out.println("Number of elements in the queue: " + queue.size());
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        scanner.close();
    }
}
