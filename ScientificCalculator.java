import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalculator {
    //declare constants

    public static void main(String args[]){
        // main loop
        int exit = 5;
        String menu = "Options: \n 1.add \n 2.subtract \n 3.Multiply \n 4. divide \n 5. exit \n"; //in a sep method
        //will add the rest l8r
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        int choice =  scanner.nextInt();
        while (choice != exit){
            switch (choice){
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
                default:
                    System.out.println("Error, choose a valid item from the menu");
                    break;

            }

            System.out.println(menu);
            choice =  scanner.nextInt();
        }




    }
    // --- Menu Display Method ---
    public static void displayMenu() {
    // Print all calculator options
    }
    // --- Basic Arithmetic Methods ---
    public static double add(double num1, double num2) {
        return num1+num2;
    }
     public static double subtract(double num1, double num2) {
         return num1-num2;
     }
     public static double multiply(double num1, double num2) {
        return num1*num2;
     }
     public static double divide(double num1, double num2) {
        return num1 / num2;
     }
    // --- Scientific Math Methods ---
     public static double calculateSquareRoot(double num) {
        return Math.sqrt(num);
     }
     public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);

     }
     public static double calculateSine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
     }
    public static double calculateCosine(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }
    public static double calculateTangent(double degrees) {
        return Math.tan(Math.toRadians(degrees));
    }
    public static double calculateNaturalLogarithm(double num){
        return Math.log(num);
    }

    public static double calculateLogarithmBase10(double num){
        return Math.log10(num);
    }
    public static double absolute(double num){
        return Math.abs(num);
    }
    public static long roundNumber(double num){
        return Math.round(num);
    }
    public static double ceilingNumber(double num){
        return Math.ceil(num);
    }
    public static double
    floorNumber(double num){
        return Math.floor(num);
    }
    public static double findMin(double

                                         num1, double num2){
        return Math.min(num1, num2);
    }
    public static double

    findMax(double num1, double
            num2){
        return Math.max(num1, num2);
    }


}
