package Programming_II.file_handling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class secmessage {
     public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          
            System.out.print("Enter the first file name: ");
            String firstFileName = reader.readLine();
            
            System.out.print("Enter the content for the first file: ");
            String content = reader.readLine();
            
            FileWriter firstFileWriter = new FileWriter(firstFileName);
            firstFileWriter.write(content);
            firstFileWriter.close();
            
            String encryptedContent = encryptContent(content);
            
            System.out.print("Enter the second file name: ");
            String secondFileName = reader.readLine();
            
            FileWriter secondFileWriter = new FileWriter(secondFileName);
            secondFileWriter.write(encryptedContent);
            secondFileWriter.close();
            
            System.out.print("Content written to both files.");
            
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static String encryptContent(String content) {
        StringBuilder encrypted = new StringBuilder();
        
        for (int i = 0; i < content.length(); i++) {
            char ch = content.charAt(i);
            int encryptedValue = (int) ch + 5;
            char encryptedChar = (char) encryptedValue;
            encrypted.append(encryptedChar);
        }
        
        return encrypted.toString();
    }
}

