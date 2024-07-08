package OOP.abstraction;

import java.util.Scanner;

abstract class Shape {
    abstract float area();
}

class Circle extends Shape {
    private double radius;
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    float area() {
        return (float) (Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    float area() {
        return (float) (length * width);
    }
}

public class shapes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Choose the shape to create: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                Circle circle = new Circle();
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                circle.setRadius(radius);
                System.out.printf("Area of the circle: %.2f\n", circle.area());
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                rectangle.setDimensions(length, width);
                System.out.printf("Area of the rectangle: %.2f\n", rectangle.area());
                break;
            default:
                System.out.println("Invalid choice");
        }
        
        scanner.close();
    }
}
