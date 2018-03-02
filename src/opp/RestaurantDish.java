package opp;

public class RestaurantDish {

//    Include an integer property called "costInCents"
//    Include a string property called "nameOfDish"
//    Include a boolean property called "wouldRecommend"
//    Include a method called "eat" this method will print out "Nom nom nom!"

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void eat() {
        System.out.println("Nom Nom Nom!");
    }

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public int getCostInCents() {
        return this.costInCents;
    }

    public String getNameOfDish() {
        return this.nameOfDish;
    }

    public boolean getWouldRecommend() {
        return this.wouldRecommend;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

}