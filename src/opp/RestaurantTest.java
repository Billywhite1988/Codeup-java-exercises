package opp;

public class RestaurantTest {

    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish(350, "Spicy Meatball", true);
        System.out.printf("%s - %d¢, %s\n", dish.getNameOfDish(), dish.getCostInCents(), dish.getWouldRecommend() ? "10/10 Would Recommend" : "Would Not Recommend");
        dish.eat();
    }
}

