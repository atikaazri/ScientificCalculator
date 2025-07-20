import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalculator {
    //declare constants
    static Scanner scanner = new Scanner(System.in); //to use it in main + funcs
    public static void main(String args[]) {
        // main loop
        int exit = 18;  //temp just because its changing as i'm adding funcs


        int choice = getValidMenuChoice();
        while (choice != exit) {
            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    performSquareRoot();
                    break;
                case 6:
                    performPower();
                    break;
                case 7:
                    performSine();
                    break;
                case 8:
                    performCosine();
                    break;
                case 9:
                    performTangent();
                    break;
                case 10:
                    performNaturalLog();
                    break;
                case 11:
                    performLogBase10();
                    break;
                case 12:
                    performAbsolute();
                    break;
                case 13:
                    performRound();
                    break;
                case 14:
                    performCeiling();
                    break;
                case 15:
                    performFloor();
                    break;
                case 16:
                    performMinimum();
                    break;
                case 17:
                    performMaximum();
                    break;
                default:
                    System.out.println("Error, choose a valid item from the menu");
                    break;
            }

            choice = getValidMenuChoice();


        }
    }
    public static int getValidMenuChoice() {
        int choice = -1;

        while (true) {
            displayMenu();
            System.out.print("Select an operation (1-18): ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline

                if (choice >= 1 && choice <= 18) {
                    break; // valid input in range
                } else {
                    System.out.println("Error: Choice must be between 1 and 18.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer between 1 and 18.");
                scanner.nextLine(); // consume invalid input to avoid infinite loop
            }
        }

        return choice;
    }



    // --- Menu Display Method ---
        public static void displayMenu () {
            String menu = "1.add\n2.subtract\n3.Multiply\n4. divide\n5. Square root\n6. power\n7. sin\n8. cos\n9. tan\n10. natural log\n11. log base 10\n12. absolute\n13. round\n14. ceil\n15. floor\n16. minimum\n17. maximum\n18. exit \n"; //in a sep method
            System.out.println("Options: ");
            System.out.println(menu);

        }
    public static double getValidDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Double.parseDouble(scanner.nextLine().trim());
                break; // valid input, exit loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return value;
    }
        public static List<Double> readNumbers(int len) {
            List<Double> nums = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                nums.add(getValidDouble(scanner, "Enter number " + (i + 1) + ": "));
            }
            return nums;
        }




        // --- Basic Arithmetic Methods ---
        public static double add ( double num1, double num2){

            return num1 + num2;
        }
        public static double subtract ( double num1, double num2){
            return num1 - num2;
        }
        public static double multiply ( double num1, double num2){
            return num1 * num2;
        }
        public static double divide ( double num1, double num2){
            return num1 / num2;
        }
        // --- Scientific Math Methods ---
        public static double calculateSquareRoot ( double num){
            return Math.sqrt(num);
        }
        public static double calculatePower ( double base, double exponent){
            return Math.pow(base, exponent);

        }
        public static double calculateSine ( double degrees){
            return Math.sin(Math.toRadians(degrees));
        }
        public static double calculateCosine ( double degrees){
            return Math.cos(Math.toRadians(degrees));
        }
        public static double calculateTangent ( double degrees){
            return Math.tan(Math.toRadians(degrees));
        }
        public static double calculateNaturalLogarithm ( double num){
            return Math.log(num);
        }

        public static double calculateLogarithmBase10 ( double num){
            return Math.log10(num);
        }
        public static double absolute ( double num){
            return Math.abs(num);
        }
        public static long roundNumber ( double num){
            return Math.round(num);
        }
        public static double ceilingNumber ( double num){
            return Math.ceil(num);
        }
        public static double
        floorNumber( double num){
            return Math.floor(num);
        }
        public static double findMin ( double

        num1,double num2){
            return Math.min(num1, num2);
        }
        public static double

        findMax( double num1, double
        num2){
            return Math.max(num1, num2);
        }
    // --- Helper Methods for User Interaction (calling from main's switch-case) ---

    private static void performAddition() {
        List<Double> nums = readNumbers(2);
        System.out.println("Result: " + add(nums.get(0), nums.get(1)));
    }

    private static void performSubtraction() {
        List<Double> nums = readNumbers(2);
        System.out.println("Result: " + subtract(nums.get(0), nums.get(1)));
    }

    private static void performMultiplication() {
        List<Double> nums = readNumbers(2);
        System.out.println("Result: " + multiply(nums.get(0), nums.get(1)));
    }

    private static void performDivision() {
        List<Double> nums = readNumbers(2);
        while (nums.get(1) == 0) {
            System.out.println("Error: Denominator cannot be zero. Please re-enter the numbers.");
            nums = readNumbers(2);
        }
        System.out.println("Result: " + divide(nums.get(0), nums.get(1)));
    }


    private static void performSquareRoot() {
        List<Double> nums = readNumbers(1);
        while (nums.get(0) < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number. Please try again.");
            nums = readNumbers(1);
        }
        System.out.println("Result: " + calculateSquareRoot(nums.get(0)));
    }



    private static void performPower() {
        List<Double> nums = readNumbers(2);
        System.out.println("Result: " + calculatePower(nums.get(0), nums.get(1)));
    }

    private static void performSine() {
        double num = getValidDouble(scanner, "Enter angle in degrees: ");
        System.out.println("Result: " + calculateSine(num));
    }

    private static void performCosine() {
        double num = getValidDouble(scanner, "Enter angle in degrees: ");
        System.out.println("Result: " + calculateCosine(num));
    }

    private static void performTangent() {
        double num = getValidDouble(scanner, "Enter angle in degrees: ");
        System.out.println("Result: " + calculateTangent(num));
    }

    private static void performNaturalLog() {
        List<Double> nums = readNumbers(1);
        while (nums.get(0) <= 0) {
            System.out.println("Error: Natural logarithm is only defined for positive numbers. Please try again.");
            nums = readNumbers(1);
        }
        System.out.println("Result: " + calculateNaturalLogarithm(nums.get(0)));
    }

    private static void performLogBase10() {
        List<Double> nums = readNumbers(1);
        while (nums.get(0) <= 0) {
            System.out.println("Error: Log base 10 is only defined for positive numbers. Please try again.");
            nums = readNumbers(1);
        }
        System.out.println("Result: " + calculateLogarithmBase10(nums.get(0)));
    }



    private static void performAbsolute() {
        double num = getValidDouble(scanner, "Enter the number: ");
        System.out.println("Result: " + absolute(num));
    }

    private static void performRound() {
        double num = getValidDouble(scanner, "Enter the number: ");
        System.out.println("Result: " + roundNumber(num));
    }

    private static void performCeiling() {
        double num = getValidDouble(scanner, "Enter the number: ");
        System.out.println("Result: " + ceilingNumber(num));
    }

    private static void performFloor() {
        double num = getValidDouble(scanner, "Enter the number: ");
        System.out.println("Result: " + floorNumber(num));
    }

    private static void performMinimum() {
        List<Double> nums = readNumbers(2);
        System.out.println("Result: " + findMin(nums.get(0), nums.get(1)));
    }

    private static void performMaximum() {
        List<Double> nums = readNumbers(2);
        System.out.println("Result: " + findMax(nums.get(0), nums.get(1)));
    }



}
