package Programming_II.conditional;

import java.util.Scanner;
public class discountcalcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total purchase amount: ");
        double totalPurchaseAmount = scanner.nextDouble();
        
        double discount = 0;
        if (totalPurchaseAmount > 5000) {
            discount = totalPurchaseAmount * 0.10;
        } else {
            discount = totalPurchaseAmount * 0.05;
        }
        
        double finalPrice = totalPurchaseAmount - discount;
        
        System.out.printf("Initial Purchase Amount: %.2f\n", totalPurchaseAmount);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Final Price: %.2f\n", finalPrice);
        
        scanner.close();
    }
}
