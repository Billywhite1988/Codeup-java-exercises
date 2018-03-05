//   Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
//   Create a method that will return a random element from an array of strings.
//   Add a main method, and inside of your main method select and random noun and adjective and
//   hyphenate the combination and display the generated name to the user

    public class ServerNameGenerator {
    public static String getRandomString(String[] strings) {
        int randomElement = (int) (Math.random() * strings.length);
        return strings[randomElement];
    }

    public static void main (String [] args) {

    String[] nouns = {"business", "child", "day", "hand", "home", "life", "job", "people", "government", "company"};

    String[] adjectives = {"attractive", "beautiful", "thoughtful", "fancy", "gorgeous", "muscular", "random", "handsome", "skinny", "chubby"};

    String serverName = getRandomString(adjectives) + "-" + getRandomString(nouns);

        System.out.println("Your server name is: " + serverName);


    }
}
