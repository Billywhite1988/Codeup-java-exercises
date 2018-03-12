package util;

import java.util.Scanner;

public class Input {

    private Scanner input;
    private int min;
    private int max;
    private boolean prompt;

    public String getString() {
        return this.input.nextLine();
    }

    public String getString(boolean prompt) {
        this.prompt = prompt;
        System.out.print("Enter A String: ");
        return getString();
    }

    private boolean yesNo() {
        String s = this.input.nextLine();
        return "y".equalsIgnoreCase(s) || "yes".equalsIgnoreCase(s);
    }

    public boolean yesNo(boolean prompt) {
        this.prompt = prompt;
        System.out.print("(Yes/No): ");
        return yesNo();
    }

    public int getInt() {
        try {
            return Integer.valueOf(this.input.nextLine());
        } catch(NumberFormatException e) {
            System.out.print("Exception caught!!! Invalid Input, Try Again: ");
            return getInt();
        }

    }

    public int getInt(boolean prompt) {
        this.prompt = prompt;
        System.out.print("Enter An Integer: ");
        return getInt();
    }

    private int getInt(int min, int max) {
        int n = getInt();
        return ( n >= min && n <= max ) ? n : getInt(min, max);
    }

    public int getInt(int min, int max, boolean prompt) {
        this.min = min;
        this.max = max;
        this.prompt = prompt;
        System.out.printf("Enter an Integer between %d and %d: ", min, max);
        return getInt(min, max);
    }

    public double getDouble() {
        try {
            return Double.valueOf(this.input.nextLine());
        } catch(NumberFormatException e) {
            System.out.print("Exception caught!!! Invalid Input, Try Again: ");
            return getDouble();
        }
    }

    public double getDouble(boolean prompt) {
        this.prompt = prompt;
        System.out.print("Enter A Double: ");
        return getDouble();
    }

    private double getDouble(double min, double max) {
        double n = getDouble();
        return ( n >= min && n <= max ) ? n : getDouble(min, max);
    }

    public double getDouble(double min, double max, boolean prompt) {
        this.prompt = prompt;
        System.out.printf("Enter a Double between %f and %f: ", min, max);
        return getDouble();
    }

    public int getBinary() {
        try {
            System.out.print("Enter A Binary Number: ");
            return Integer.valueOf(this.input.nextLine(), 2);
        } catch (NumberFormatException e) {
            System.out.print("Exception caught!!! Invalid Input, Try Again: ");
            return getBinary();
        }
    }

    public int getHex() {
        try {
            System.out.print("Enter A Hex Number: ");
            return Integer.valueOf(this.input.nextLine(), 16);
        } catch (NumberFormatException e) {
            System.out.print("Exception caught!!! Invalid Input, Try Again: ");
            return getHex();
        }
    }

    public Input() {
        this.input = new Scanner(System.in);
    }
}