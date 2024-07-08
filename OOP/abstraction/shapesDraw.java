package OOP.abstraction;

import java.util.Scanner;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("   ***** ");
        System.out.println(" **     **");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println(" **     **");
        System.out.println("   *****");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*****");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
    }
}

public class shapesDraw{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Choose the shape to create: ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                Circle circle = new Circle();
                circle.draw();
                break;
            case 2:
                Square square = new Square();
                square.draw();
                break;
            case 3:
                Rectangle rectangle = new Rectangle();
                rectangle.draw();
                break;
            case 4:
                Triangle triangle = new Triangle();
                triangle.draw();
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}
