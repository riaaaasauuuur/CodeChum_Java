package Data_Structures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class textEditor{
    private static Stack<String> textStack = new Stack<>();
    private static Stack<String> redoStack = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operations:");
        System.out.println("1 - Enter a string");
        System.out.println("2 - Undo and print");
        System.out.println("3 - Redo and print");
        System.out.println("4 - Exit");
        System.out.println(" ");

        boolean running = true;
        while (running) {
            System.out.print("Enter an operation: ");
            int operation = scanner.nextInt();
            scanner.nextLine(); 

            switch (operation) {
                case 1:
                    System.out.print("Enter a string: ");
                    String input = scanner.nextLine();
                    textStack.push(input);
                    redoStack.clear(); 
                    System.out.println("Current text: " + input);
                    System.out.println(" ");
                    break;
                case 2:
                    undo();
                    break;
                case 3:
                    redo();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }

        scanner.close();
    }

    private static void undo() {
        if (!textStack.isEmpty()) {
            String undoneText = textStack.pop();
            redoStack.push(undoneText);
            if (!textStack.isEmpty())
                System.out.println("Current text: " + textStack.peek());
            else
                System.out.println("No more operations to undo.");
                System.out.println(" ");
        } else {
            System.out.println("No more operations to undo.");
            System.out.println(" ");
        }
    }

    private static void redo() {
        if (!redoStack.isEmpty()) {
            String redoneText = redoStack.pop();
            textStack.push(redoneText);
            System.out.println("Current text: " + redoneText);
            System.out.println(" ");
        } else {
            System.out.println("No more operations to redo.");
            System.out.println(" ");
        }
    }
}
