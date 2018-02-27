import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int userInt = sc.nextInt();
        System.out.println(userInt);



//      Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//        System.out.println("Please enter three words");
//
        String firstWord, secondWord, thirdWord;


        firstWord = sc.nextLine();
        secondWord = sc.nextLine();
        thirdWord = sc.nextLine();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

//      Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.

        System.out.println("Please enter a sentence: ");

        String sentence = sc.nextLine();

        System.out.println(sentence);

//        Prompt the user to enter values of length and width of the classroom.
//        Use the .nextLine method to get user input and cast the resulting string to a numeric type.

        System.out.println("Enter the classroom length ");
        String lengthString =sc.nextLine();
        double length = Double.parseDouble(lengthString);

        System.out.println("Enter the classroom width");
        String widthString = sc.nextLine();
        double width = Double.parseDouble(widthString);

        double area = width * length;
        double perimeter = width * 2 + length * 2;

        System.out.printf("%.2f = %.2f x %.2f\n", area, length, width);
        System.out.printf("%.2f = 2 x %.2f + 2 x %.2f\n", perimeter, length, width);



    }
}
