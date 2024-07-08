package Data_Structures.Priority_Queues;

import java.util.*;

class QueueElement {
    int value;
    int priority;

    public QueueElement(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Value: " + value + ", Priority: " + priority;
    }
}

class PriorityQueue {
    private List<QueueElement> queue;

    public PriorityQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(int value, int priority) {
        QueueElement newElement = new QueueElement(value, priority);
        queue.add(newElement);
    }

    public void swapValuesAndPriorities() {
        for (QueueElement element : queue) {
            int temp = element.value;
            element.value = element.priority;
            element.priority = temp;
        }
       
        Collections.sort(queue, new Comparator<QueueElement>() {
            @Override
            public int compare(QueueElement o1, QueueElement o2) {
                return Integer.compare(o2.priority, o1.priority); 
            }
        });
    }

    public List<QueueElement> getQueue() {
        return queue;
    }
}

public class swapping{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue priorityQueue = new PriorityQueue();

        System.out.print("Enter the number of elements in the priority queue: ");
        int numElements = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numElements; i++) {
            System.out.print("Enter the value for element " + i + ": ");
            int value = scanner.nextInt();
            System.out.print("Enter the priority for element " + i + ": ");
            int priority = scanner.nextInt();
            scanner.nextLine(); 
            priorityQueue.enqueue(value, priority);
        }

        System.out.println("\nSwapping value and priority...\n");

        priorityQueue.swapValuesAndPriorities();

        List<QueueElement> updatedQueue = priorityQueue.getQueue();
        System.out.println("Updated priority queue:");
        for (int i = 0; i < updatedQueue.size(); i++) {
            QueueElement element = updatedQueue.get(i);
            System.out.println("Element " + (i + 1) + " - " + element);
        }

        scanner.close();
    }
}
