package OOP.file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileAppend{
    public static void main(String[] args) {
        String fileName = "file.txt";

        try {
            FileWriter writer = new FileWriter(fileName, true);

            writer.write("This is the initial content of the file.\nIt can be any text you want.\nThe program will append the new text entered by the user.\n");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the text to append: ");
            String text = scanner.nextLine();

            writer.write(text);
            writer.write("\n"); 
            writer.close();

            System.out.println("Text appended to the file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}