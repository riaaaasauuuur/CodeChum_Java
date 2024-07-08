import java.util.Scanner;

public class tab{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String inputString = scanner.nextLine();

        System.out.println("\t" + inputString);
        System.out.println("\t\t" + inputString);
        System.out.println("\t\t" + inputString);
        System.out.println("\t\t\t" + inputString);
        System.out.println("\t\t\t" + inputString);
        System.out.println("\t\t" + inputString);
        System.out.println("\t\t" + inputString);
        System.out.println("\t" + inputString);
        System.out.println(inputString);

        scanner.close();
    }
}