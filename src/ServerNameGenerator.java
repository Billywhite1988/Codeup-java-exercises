//   Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
//   Create a method that will return a random element from an array of strings.
//   Add a main method, and inside of your main method select and random noun and adjective and
//   hyphenate the combination and display the generated name to the user

public class ServerNameGenerator {
    public static String getRandomString(String[] strings) {
        int randomIndex = (int) (Math.random() * strings.length);
        return strings[randomIndex];
    }



}
