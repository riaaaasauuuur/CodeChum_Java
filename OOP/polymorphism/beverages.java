package OOP.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Beverage {
    public abstract void taste();
}

class Soda extends Beverage {
    @Override
    public void taste() {
        System.out.println("Sweet!");
    }
}

class Water extends Beverage {
    @Override
    public void taste() {
        System.out.println("Water!");
    }
}

class Juice extends Beverage {
    @Override
    public void taste() {
        System.out.println("Fruity!");
    }
}

public class beverages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Beverage> beverages = new ArrayList<>();
        
            System.out.println("Enter operation:");
            System.out.println("1 - Add Soda");
            System.out.println("2 - Add Water");
            System.out.println("3 - Add Juice");
            System.out.println("4 - Exit");
            System.out.println(" ");
        
        int operation;
        do {
            System.out.print("Enter operation: ");
            operation = scanner.nextInt();
            
            switch (operation) {
                case 1:
                    beverages.add(new Soda());
                    break;
                case 2:
                    beverages.add(new Water());
                    break;
                case 3:
                    beverages.add(new Juice());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        } while (operation != 4);
            System.out.println(" ");
        
        for (Beverage beverage : beverages) {
            beverage.taste();
        }
        
        scanner.close();
    }
}
