package OOP.encapsulation;

import java.util.Scanner;

public class car {
    private String brand;
    private int size;
    private String color;
    private int Car;
    
    public car (String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        
        car car = new car(brand, size, color);
        
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Size: " + car.getSize());
        System.out.println("Color: " + car.getColor());
        
        scanner.close();
    }
}

