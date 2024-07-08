package OOP.polymorphism;

import java.util.Scanner;

abstract class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public abstract double pay();
}

class Manager extends Employee {
    private double bonus;

    public Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        return salary + bonus;
    }
}

class Salesperson extends Employee {
    private double commission;
    private int sales;

    public Salesperson(double salary, double commission, int sales) {
        super(salary);
        this.commission = commission;
        this.sales = sales;
    }

    @Override
    public double pay() {
        return salary + (commission * sales);
    }
}

class Engineer extends Employee {
    private int hours;

    public Engineer(double salary, int hours) {
        super(salary);
        this.hours = hours;
    }

    @Override
    public double pay() {
        return salary * hours;
    }
}

public class employeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Choose the employee type: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter manager's salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter manager's bonus: ");
            double bonus = scanner.nextDouble();
            
            Employee manager = new Manager(salary, bonus);
            System.out.printf("Pay amount: %.2f\n", manager.pay());
        } else if (choice == 2) {
            System.out.print("Enter salesperson's salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter salesperson's commission: ");
            double commission = scanner.nextDouble();
            System.out.print("Enter number of sales: ");
            int sales = scanner.nextInt();
            
            Employee salesperson = new Salesperson(salary, commission, sales);
            System.out.printf("Pay amount: %.2f\n", salesperson.pay());
        } else if (choice == 3) {
            System.out.print("Enter engineer's salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter number of hours worked: ");
            int hours = scanner.nextInt();
            
            Employee engineer = new Engineer(salary, hours);
            System.out.printf("Pay amount: %.2f\n", engineer.pay());
        } else {
            System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}
