import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Select an operation: ");
        System.out.println("1. Square root");
        System.out.println("2. Natural log");
        System.out.println("3. Factorial");
        System.out.println("4. Power function");
        System.out.println("0. Exit");

        choice = scanner.nextInt();
        while (choice != 0){

            switch (choice) {
                case 1:
                    System.out.println("You have chosen Square Root Operation");
                    System.out.println("Enter a number: ");
                    double num1 = scanner.nextDouble();
                    double sqrt = squareRoot(num1);
                    System.out.println("Square root of " + num1 + " is " + sqrt);
                    break;

                case 2:
                    System.out.println("You have chosen Natural Log Operation");
                    System.out.println("Enter a number: ");
                    double num2 = scanner.nextDouble();
                    double log = naturalLogarithm(num2);
                    System.out.println("log " + num2 + " base e is equal to " + log);
                    break;

                case 3:
                    System.out.println("You have chosen Factorial Operation");
                    System.out.println("Enter a number: ");
                    int num3 = scanner.nextInt();
                    int fact = factorial(num3);
                    System.out.println(num3 + "! = " + fact);
                    break;

                case 4:
                    System.out.println("You have chosen Power Operation");
                    System.out.print("Enter the value of x: ");
                    double x = scanner.nextDouble();
                    System.out.print("Enter the value of b: ");
                    double b = scanner.nextDouble();
                    double power = power(x, b);
                    System.out.println(x + " power " + b + " is " + power);
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println("Select an operation: ");
            System.out.println("1. Square root");
            System.out.println("2. Natural log");
            System.out.println("3. Factorial");
            System.out.println("4. Power function");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
        }
        scanner.close();
    }

    public static double squareRoot(double num){
        return Math.sqrt(num);
    }

    public static double naturalLogarithm(double num){
        return Math.log(num);
    }
    public static int factorial(int num){
        if(num == 0 || num == 1)
            return 1;
        return num*factorial(num-1);
    }
    public static double power(double x, double b){
        return Math.pow(x, b);
    }
}
