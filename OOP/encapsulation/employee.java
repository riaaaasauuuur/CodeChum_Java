package OOP.encapsulation;

import java.util.Scanner;

public class employee {
     private int id;
    private String name;
    private String role;
    private int yearEmployed;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getYearEmployed() {
        return yearEmployed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setYearEmployed(int yearEmployed) {
        this.yearEmployed = yearEmployed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        employee employee = new employee();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        employee.setId(id);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        employee.setName(name);

        System.out.print("Enter employee role: ");
        String role = scanner.nextLine();
        employee.setRole(role);

        System.out.print("Enter year employed: ");
        int yearEmployed = scanner.nextInt();
        employee.setYearEmployed(yearEmployed);

        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Role: " + employee.getRole());
        System.out.println("Year Employed: " + employee.getYearEmployed());

        scanner.close();
    }
}

