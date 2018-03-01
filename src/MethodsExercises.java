import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

/////////// 1. Create four separate methods. Each will perform an arithmetic operation: /////////////
            System.out.println(add(2.5, 2.5));
            System.out.println(subtract(2, 2));
            System.out.println(multiply(2, 2));
            System.out.println(divide(2, 10));
            System.out.println(modulus(100, 2));

/////////// 2. Create a method that validates that user input is in a certain range ////////////////
//            System.out.print("Enter a number between 1 and 10: ");
//            int userInput = getInteger(1, 10);
//            System.out.println("Your integer is: " + userInput);

    }

////////// 1. Create four separate methods. Each will perform an arithmetic operation: /////////////

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }


//////// 2. Create a method that validates that user input is in a certain range ////////////////

//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        if (!sc.hasNextInt()) {
//            System.out.println("Not a number!");
//            return getInteger(min, max);
//        }
//        int userInput = sc.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        } else {
//            System.out.println("Number not in range!");
//            return getInteger(min, max);
//        }
//    }

}