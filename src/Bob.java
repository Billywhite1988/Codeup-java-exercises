import java.util.Scanner;

//    Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager.In conversation, his responses are very limited.

    public class Bob {

        public static void main(String[] args) {
            System.out.println("Say something to Bob!");
            Scanner scan = new Scanner(System.in);

            String userInput = scan.nextLine();

            // Bob answers 'Sure.' if you ask him a question.(Question mark trigger responds
            boolean endsWithQuestionMark = userInput.endsWith("?");

            // Bob answers "Whoa, chill out!" if you yell (UPPERCASE trigger responds
            boolean isYelling = userInput.equals(userInput.toUpperCase());

            // Bob says "Fine. Be that way" if you don't actually say anything(Pressing return trigger responds
            boolean didNotSayAnything = userInput.trim().isEmpty();

            if(endsWithQuestionMark) {
                System.out.println("Sure.");
            } else if(isYelling) {
                System.out.println("Whoa, chill out!");
            } else if(didNotSayAnything) {
                System.out.println("Fine. Be that way");
            } else {
                System.out.println("Whatever");
            }

        }
    }

