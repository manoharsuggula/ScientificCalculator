import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScientificCalculator {

    private static Logger logger = LogManager.getLogger(ScientificCalculator.class);
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
        logger.info("[SQRT] - " + num);
        if(num<0)
        {
            logger.error("[ERROR] - Factorial of -ve number not defined.");
            return -1.0;
        }
        double ans = Math.sqrt(num);
        logger.info("[RESULT - SQRT] - " + ans);
        return ans;
    }

    public static double naturalLogarithm(double num){
        logger.info("[LOG] - " + num);
        if(num == 0)
        {
            logger.error("[ERROR] - Loagithm of 0 not defined.");
            return -1.0;
        }
        if(num < 0)
        {
            logger.error("[ERROR] - Loagithm of -ve not defined.");
            return -1.0;
        }
        double ans = Math.log(num);
        logger.info("[RESULT - LOG] - " + ans);
        return ans;
    }
    public static int factorial(int num){
        logger.info("[FACTORIAL] - " + num);
        if(num < 0)
        {
            logger.error("[ERROR] - Factorial of -ve not defined.");
            return -1;
        }
        if(num == 0 || num == 1)
        {
            logger.info("[RESULT - FACTORIAL] - 1");
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
                fact *= i;
        }
        logger.info("[RESULT - FACTORIAL] - " + fact);
        return fact;
    }
    public static double power(double x, double b){
        logger.info("[POWER] - " + x + ", " + b);
        if(x == 0 && b == 0)
        {
            logger.error("[ERROR] - 0 power 0 is not defined.");
            return -1.0;
        }
        double ans = Math.pow(x, b);
        logger.info("[RESULT - POWER] - " + ans);
        return ans;
    }
}
