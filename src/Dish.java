public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary () {
        System.out.printf("Cost: %.2f\nName: %s\nRecommended: %b\n", costInCents / 100., nameOfDish, wouldRecommend);
    }

}
