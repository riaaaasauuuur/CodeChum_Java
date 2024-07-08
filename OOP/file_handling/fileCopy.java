package OOP.file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileCopy{
    public static void main(String[] args) {
        String filename = "text.txt";
        
        String keyword = "Keyword";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;
            boolean found = false;
            
            System.out.println("Enter the keyword to search: " + keyword);
            System.out.println("Keyword found at line(s):");
            
            while ((line = br.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(lineNumber);
                    found = true;
                }
                lineNumber++;
            }
            
            if (!found) {
                System.out.println("Keyword not found in the file.");
            }
            
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
