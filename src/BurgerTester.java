
public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools.mostPopularTopping = "Pepper Jack Cheese";
        BurgerTools.averageDaysBeforeExpiration = 7;
        BurgerTools.temperatureWhenCooked = 360;
        System.out.printf("Topping: %s, Expires in %d days, Cooked at %d°\n", BurgerTools.mostPopularTopping, BurgerTools.averageDaysBeforeExpiration, BurgerTools.temperatureWhenCooked);
        BurgerTools.grill();
    }
}