package Programming_II.strings;

import java.util.Scanner;
public class whitespace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String modifiedString = removeWhitespace(input);
        
        System.out.println("Modified string: " + modifiedString);
        
        scanner.close();
    }
    
    public static String removeWhitespace(String input) {
        return input.replaceAll("\\s", "");
    }
}
