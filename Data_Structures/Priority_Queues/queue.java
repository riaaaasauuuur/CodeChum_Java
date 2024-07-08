package Data_Structures.Priority_Queues;

import java.util.*;

class QueueElement {
    int element;
    int priority;

    public QueueElement(int element, int priority) {
        this.element = element;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Element: " + element + ", Priority: " + priority;
    }
}

class PriorityQueue {
    private List<QueueElement> queue;

    public PriorityQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(int element, int priority) {
        QueueElement newElement = new QueueElement(element, priority);
        queue.add(newElement);
        System.out.println("Element enqueued successfully.");
        printQueue();
    }

    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Priority Queue is empty. Cannot dequeue.");
        } else {
            QueueElement highestPriorityElement = findHighestPriority();
            queue.remove(highestPriorityElement);
            System.out.println("Dequeued Element:");
            System.out.println(highestPriorityElement);
            printQueue();
        }
    }

    public boolean search(int element) {
        for (QueueElement queueElement : queue) {
            if (queueElement.element == element) {
                return true;
            }
        }
        return false;
    }

    public List<QueueElement> getQueue() {
        return queue;
    }

    private QueueElement findHighestPriority() {
        QueueElement highest = queue.get(0);
        for (int i = 1; i < queue.size(); i++) {
            if (queue.get(i).priority < highest.priority) {
                highest = queue.get(i);
            }
        }
        return highest;
    }

    private void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("Priority Queue: ");
        } else {
            System.out.println("Priority Queue:");
            for (QueueElement element : queue) {
                System.out.println(element);
            }
        }
    }
}

public class queue{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue priorityQueue = new PriorityQueue();

        System.out.println("Options:");
        System.out.println("1 - Enqueue an element");
        System.out.println("2 - Dequeue an element");
        System.out.println("3 - Search for an element");
        System.out.println("4 - Exit the program");
        int option;
        
        do {
            System.out.print("\nEnter your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = scanner.nextInt();
                    System.out.print("Enter the priority of the element: ");
                    int priority = scanner.nextInt();
                    priorityQueue.enqueue(element, priority);
                    break;
                case 2:
                    priorityQueue.dequeue();
                    break;
                case 3:
                    System.out.print("Enter the element to search: ");
                    int searchElement = scanner.nextInt();
                    if (priorityQueue.search(searchElement)) {
                        System.out.println("Element found in the Priority Queue:");
                        
                        for (QueueElement queueElement : priorityQueue.getQueue()) {
                            if (queueElement.element == searchElement) {
                                System.out.println(queueElement);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Element not found in the Priority Queue.");
                    }
                    break;
                case 4:
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1, 2, 3, or 4.");
            }

        } while (option != 4);

        scanner.close();
    }
}
