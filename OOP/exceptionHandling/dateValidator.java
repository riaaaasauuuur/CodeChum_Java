package OOP.exceptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dateValidator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a date in the format dd-mm-yyyy: ");
            String input = scanner.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            dateFormat.setLenient(false);

            Date date = dateFormat.parse(input);

            System.out.println("Entered date: " + input);
        } catch (ParseException e) {
            System.out.println("Error: Invalid date format. Please enter a date in the format dd-mm-yyyy.");
        } finally {
            scanner.close();
        }
    }
}
