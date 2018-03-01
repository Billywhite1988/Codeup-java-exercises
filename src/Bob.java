import java.util.Scanner;

//    Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager.In conversation, his responses are very limited.

    public class Bob {

        public static void main(String[] args) {
            System.out.println("Say something to Bob!");
            Scanner scan = new Scanner(System.in);

            String userInput = scan.nextLine();

            // Bob answers 'Sure.' if you ask him a question.
            boolean endsWithQuestionMark = userInput.endsWith("?");

            // Bob answers "Whoa, chill out!" if you yell (Yelling is all uppercase or ending with a ! character
            boolean isYelling = userInput.equals(userInput.toUpperCase()) || userInput.endsWith("!");

            // Bob says "Fine. Be that way" if you don't actually say anything
            boolean didNotSayAnything = userInput.trim().isEmpty();


    }

