package Data_Structures.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class restaurant{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> waitlist = new LinkedList<>();
        int customerNumber = 0;
        
        System.out.println("Welcome to the Restaurant Waitlist Program!\n");
        
        System.out.println("Options:");
        System.out.println("1 - Join the waitlist");
        System.out.println("2 - Be seated");
        System.out.println("3 - Exit the program\n");

        
        while (true) {
            System.out.print("Enter your option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    customerNumber++;
                    waitlist.add("Customer " + customerNumber);
                    System.out.printf("You have joined the waitlist. There are currently %d customer/s ahead of you.\n", waitlist.size() - 1);
                    System.out.println("Current waitlist:");
                    printWaitlist(waitlist);
                    System.out.println (" ");
                    break;
                case 2:
                    if (!waitlist.isEmpty()) {
                        System.out.printf("%s is now being seated.\n", waitlist.poll());
                        if (waitlist.isEmpty()) {
                            System.out.println("The waitlist is empty.");
                            System.out.println (" ");
                        } else {
                            System.out.println("Current waitlist:");
                            printWaitlist(waitlist);
                            System.out.println (" ");
                        }
                    } else {
                        System.out.println("The waitlist is empty.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program. Thank you for using the Restaurant Waitlist Program!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        }
    }

    private static void printWaitlist(Queue<String> waitlist) {
        for (String customer : waitlist) {
            System.out.println(customer);
        }
    }
}
