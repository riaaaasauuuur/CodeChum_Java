package Data_Structures.Priority_Queues;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

class Element {
    int value;
    int priority;

    public Element(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }
}

class ElementComparator implements Comparator<Element> {
    @Override
    public int compare(Element e1, Element e2) {
        return Integer.compare(e2.priority, e1.priority); 
    }
}

public class operations{

    public static void main(String[] args) {
        PriorityQueue<Element> priorityQueue = new PriorityQueue<>(new ElementComparator());
        Scanner scanner = new Scanner(System.in);

            System.out.println("Options:");
            System.out.println("1 - Enqueue an element");
            System.out.println("2 - Dequeue an element");
            System.out.println("3 - Exit the program");
           
            
        while (true) {
            System.out.print("\nEnter your option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 
            
            if (option == 1) {
                System.out.print("Enter the element to enqueue: ");
                int value = scanner.nextInt();
                System.out.print("Enter the priority of the element: ");
                int priority = scanner.nextInt();
                scanner.nextLine(); 
                priorityQueue.add(new Element(value, priority));
                System.out.println("Element enqueued successfully.");
                displayQueue(priorityQueue);
            } else if (option == 2) {
                if (priorityQueue.isEmpty()) {
                    System.out.println("Priority Queue is empty. Nothing to dequeue.");
                } else {
                    Element dequeuedElement = priorityQueue.poll();
                    System.out.println("Dequeued Element:");
                    System.out.println("Element: " + dequeuedElement.value + ", Priority: " + dequeuedElement.priority);
                    displayQueue(priorityQueue);
                }
            } else if (option == 3) {
                System.out.println(" ");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void displayQueue(PriorityQueue<Element> priorityQueue) {
        System.out.println("Priority Queue:");
        for (Element element : priorityQueue) {
            System.out.println("Element: " + element.value + ", Priority: " + element.priority);
        }
    }
}