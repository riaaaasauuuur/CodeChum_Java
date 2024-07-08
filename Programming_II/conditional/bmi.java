package Programming_II.conditional;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Please enter your height in meters: ");
        double height = scanner.nextDouble();
        
        double bmi = calculateBMI(weight, height);
        String bmiCategory = determineBMICategory(bmi);
        
        System.out.printf("Your BMI is %.2f\n", bmi);
        System.out.println("BMI is " + bmiCategory);
        
        scanner.close();
    }
    
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    
    public static String determineBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}

