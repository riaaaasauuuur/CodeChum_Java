package Programming_1.functions;

import java.util.Scanner;
public class averaging {
    public static float average(int sum, int count) {
        return (float) sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers:");
        while (true) {

            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            
            count++;
            sum += number;
        }

        float avg = average(sum, count);

        System.out.printf("Average: %.2f\n", avg);

        scanner.close();
    }
}
