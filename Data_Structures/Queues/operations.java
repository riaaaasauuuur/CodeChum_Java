package Data_Structures.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class operations{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Options:");
            System.out.println("1 - Add an element to the queue");
            System.out.println("2 - Remove an element from the queue");
            System.out.println("3 - Exit the program");
            System.out.println(" ");
        
        int option;
        do {
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    int element = scanner.nextInt();
                    queue.add(element);
                    System.out.println("Element " + element + " has been added to the queue.");
                    System.out.println(" ");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        int removedElement = queue.poll();
                        System.out.println("Removed element: " + removedElement);
                        System.out.println(" ");
                    } else {
                        System.out.println("Queue is empty. No element to remove.");
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
            
        } while (option != 3);
        
        scanner.close();
    }
}
