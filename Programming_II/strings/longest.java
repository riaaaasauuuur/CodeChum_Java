package Programming_II.strings;

import java.util.Scanner;
public class longest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int longestWordLength = findLongestWordLength(sentence);
        
        System.out.println("Length of the longest word: " + longestWordLength);
        
        scanner.close();
    }
    
    public static int findLongestWordLength(String sentence) {
        String[] words = sentence.split("\\s+");
        int maxLength = 0;
        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}