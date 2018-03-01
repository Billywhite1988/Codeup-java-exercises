public class MethodsExercises {
    public static void main(String[] args) {

        // Testing Exercise 1
        System.out.println(add(2.5, 2.5));
        System.out.println(subtract(2, 2));
        System.out.println(multiply(2, 2));
        System.out.println(divide(2, 10));
        System.out.println(modulus(100, 2));

    }

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
}
