import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

/////////// 1. Create four separate methods. Each will perform an arithmetic operation: /////////////
//            System.out.println(add(2.5, 2.5));
//            System.out.println(subtract(2, 2));
//            System.out.println(multiply(2, 2));
//            System.out.println(divide(2, 10));
//            System.out.println(modulus(100, 2));

/////////// 2. Create a method that validates that user input is in a certain range ////////////////
//            System.out.print("Enter a number between 1 and 10: ");
//            int userInput = getInteger(1, 10);
//            System.out.println("Your integer is: " + userInput);

/////////// 3. Calculate the factorial of a number. ////////////////////////////////////////////////

            Scanner sc = new Scanner(System.in);
//            userInteractionFactorial(sc);

/////////// 4. Create an application that simulates dice rolling ///////////////////////////////////

            rollDiceGame(sc);


    }

////////// 1. Create four separate methods. Each will perform an arithmetic operation: /////////////

//    public static double add(double num1, double num2) {
//        return num1 + num2;
//    }
//    public static double subtract(double num1, double num2) {
//        return num1 - num2;
//    }
//    public static double multiply(double num1, double num2) {
//        return num1 * num2;
//    }
//    public static double divide(double num1, double num2) {
//        return num1 / num2;
//    }
//    public static double modulus(double num1, double num2) {
//        return num1 % num2;
//    }


//////// 2. Create a method that validates that user input is in a certain range ////////////////

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int number = sc.nextInt();
        if (number >= min && number <= max) {
            return number;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }



/////////// 3. Calculate the factorial of a number. ////////////////////////////////////////////////
//
//    public static long calculateFactorial(int num) {
//        int output = 1;
//        for (int i = 1; i <= num; i += 1) {
//            output *= i;
//        }
//        return output;
//    }
//
//    public static void userInteractionFactorial(Scanner sc) {
//        boolean willContinue;
//        String userChoice;
//        do {
//            System.out.println("Please enter an integer from 1 to 12");
//            int userInt = getInteger(1, 12);
//            System.out.println(calculateFactorial(userInt));
//            do {
//                System.out.println("Do you wish to continue? [y/n]: ");
//                userChoice = sc.next().trim();
//            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//
//            willContinue = userChoice.equalsIgnoreCase("y");
//        } while (willContinue);
//    }
//
//
//
//////// 4. Create an application that simulates dice rolling ///////////////////////////////////

    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void rollDiceGame(Scanner sc) {

        String userChoice;
        System.out.print("Please enter the number of sides for the dice: ");
        int numberSides = getInteger(1, 20);
        do {
            System.out.println("You have rolled a " + randomWithRange(1, numberSides) + " and a " + randomWithRange(1, numberSides));
            do {
                System.out.println("Would you like to roll again? [y/n]");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        } while (!userChoice.equals("n"));
    }

}