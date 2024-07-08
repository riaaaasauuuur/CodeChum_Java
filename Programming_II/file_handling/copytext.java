package Programming_II.file_handling;

import java.io.*;
import java.util.Scanner;

public class copytext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the name of the initial file: ");
            String initialFileName = scanner.nextLine();

            System.out.print("");
            BufferedWriter writer = new BufferedWriter(new FileWriter(initialFileName));
            System.out.print("Enter the contents of the file: ");
            String fileContents = scanner.nextLine();
            System.out.print("");
            writer.write(fileContents);
            writer.close();

            System.out.print("");
            BufferedReader reader = new BufferedReader(new FileReader(initialFileName));
            StringBuilder contentBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append(System.lineSeparator());
            }
            reader.close();

            System.out.print("Enter the name of the new file: ");
            String newFileName = scanner.nextLine();


            System.out.print("");
            BufferedWriter newFileWriter = new BufferedWriter(new FileWriter(newFileName));
            System.out.print("");
            newFileWriter.write(contentBuilder.toString());
            newFileWriter.close();

            System.out.print("File copied successfully!");

        } catch (IOException e) {
            System.out.print("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
