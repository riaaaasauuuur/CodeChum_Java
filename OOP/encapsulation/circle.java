package OOP.encapsulation;

import java.util.Scanner;

public class circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       circle circle = new circle();

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);

        System.out.printf("Radius: %.2f\n", circle.getRadius());
        System.out.printf("Circumference: %.2f\n", circle.getCircumference());
        System.out.printf("Area: %.2f\n", circle.getArea());

        scanner.close();
    }
}

