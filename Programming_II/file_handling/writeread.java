package Programming_II.file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class writeread {
     public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the file name: ");
            String fileName = reader.readLine();

            FileWriter fileWriter = new FileWriter(fileName);

            System.out.print("Enter the contents of the file: ");
            String content = reader.readLine();
            fileWriter.write(content);
            fileWriter.close();

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.print("File contents:");
            System.out.println(" ");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

