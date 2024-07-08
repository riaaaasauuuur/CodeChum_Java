package Data_Structures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (checkBalancedBrackets(input)) {
            System.out.println("Balanced.");
        } else {
            System.out.println("Not Balanced.");
        }
    }

    public static boolean checkBalancedBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
           
            else if (ch == ')' || ch == ']' || ch == '}') {
                
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false; 
                }
            }
        }

        return stack.isEmpty();
    }

 
    public static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '[' && closing == ']') ||
               (opening == '{' && closing == '}');
    }
}
