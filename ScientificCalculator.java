import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalculator {
    //declare constants

    public static void main(String args[]) {
        // main loop
        int exit = 18;  //temp just because its changing as i'm adding funcs
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice != exit) {
            switch (choice) {
                case 1:
                    System.out.println(add(1, 2));
                    break;
                case 2:
                    System.out.println(subtract(3, 1));
                    break;
                case 3:
                    System.out.println(multiply(1, 3));
                    break;
                case 4:
                    System.out.println(divide(4, 2));
                    break;
                case 5:
                    System.out.println(calculateSquareRoot(16));
                    break;
                case 6:
                    System.out.println(calculatePower(2, 3));
                    break;
                case 7:
                    System.out.println(calculateSine(30));
                    break;
                case 8:
                    System.out.println(calculateCosine(60));
                    break;
                case 9:
                    System.out.println(calculateTangent(45));
                    break;
                case 10:
                    System.out.println(calculateNaturalLogarithm(2.71828));
                    break;
                case 11:
                    System.out.println(calculateLogarithmBase10(100));
                    break;
                case 12:
                    System.out.println(absolute(-9));
                    break;
                case 13:
                    System.out.println(roundNumber(3.6));
                    break;
                case 14:
                    System.out.println(ceilingNumber(3.2));
                    break;
                case 15:
                    System.out.println(floorNumber(3.8));
                    break;
                case 16:
                    System.out.println(findMin(5, 9));
                    break;
                case 17:
                    System.out.println(findMax(5, 9));
                    break;
                default:
                    System.out.println("Error, choose a valid item from the menu");
                    break;
            }

            displayMenu();
            choice = scanner.nextInt();
        }
    }


        // --- Menu Display Method ---
        public static void displayMenu () {
            String menu = "1.add\n2.subtract\n3.Multiply\n4. divide\n5. Square root\n6. power\n7. sin\n8. cos\n9. tan\n10. natural log\n11. log base 10\n12. absolute\n13. round\n14. ceil\n15. floor\n16. minimum\n17. maximum\n18. exit \n"; //in a sep method
            System.out.println("Options: ");
            System.out.println(menu);

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


}
