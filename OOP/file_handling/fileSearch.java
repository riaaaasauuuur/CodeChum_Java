package OOP.file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileSearch {
    public static void main(String[] args) {
        String fileName = "text.txt";

        writeInitialContentToFile(fileName);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the keyword to search: ");
        String keyword = scanner.nextLine().trim();

        if (keyword.isEmpty()) {
            System.out.println("Keyword cannot be empty. Please enter a valid keyword.");
            scanner.close();
            return;
        }

        List<String> lines = readLinesFromFile(fileName);
        List<Integer> lineNumbers = searchKeywordInContent(lines, keyword);

        if (lineNumbers.isEmpty()) {
            System.out.println("Keyword not found.");
        } else {
            System.out.println("Keyword found at line(s):");
            for (int lineNumber : lineNumbers) {
                System.out.println(lineNumber);
            }
        }

        scanner.close();
    }

    private static void writeInitialContentToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is a sample text file.\n");
            writer.write("It contains multiple lines of text.\n");
            writer.write("The keyword we are searching for is \"keyword\".\n");
            writer.write("Let's see how the program finds the occurrences of the keyword.\n");
            writer.write("The keyword can appear in different lines and positions.\n");
            writer.write("Sometimes the keyword may be part of another word like \"keywords\".\n");
            writer.write("Other times it may be in uppercase like \"KEYWORD\".\n");
            writer.write("The program should handle these variations and still find the matches.\n");
            writer.write("Keyword is an important concept in programming and information retrieval.\n");
            writer.write("It helps in searching, filtering, and analyzing text data.\n");
            writer.write("This text file serves as a test case for the keyword search program.\n");
            writer.write("Make sure to cover different scenarios and edge cases.\n");
            writer.write("The program should provide accurate results and display line numbers.\n");
            writer.write("Don't forget to handle situations where the keyword appears multiple times in a single line.\n");
            writer.write("The search algorithm should be efficient and optimized for large files.\n");
            writer.write("The program should also be user-friendly, allowing easy input and output.\n");
            writer.write("Once the search is complete, provide a summary of the total number of occurrences found.\n");
            writer.write("Ensure proper error handling and graceful termination of the program.\n");
            writer.write("End of the text file.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static List<String> readLinesFromFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(Main.class.getResourceAsStream(fileName))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
        return lines;
    }

    private static List<Integer> searchKeywordInContent(List<String> lines, String keyword) {
        List<Integer> lineNumbers = new ArrayList<>();

        
        String[] keywords = keyword.split("\\s+");

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            boolean allKeywordsFound = true;

            for (String key : keywords) {
                if (!line.contains(key)) {
                    allKeywordsFound = false;
                    break; 
                }
            }

            if (allKeywordsFound) {
                lineNumbers.add(i + 1); 
            }
        }

        return lineNumbers;
    }
}
