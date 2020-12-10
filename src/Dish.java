public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    //GETTERS
//    public int getCostInCents () {
//        return costInCents;
//    }
//
//    public String getNameOfDish () {
//        return nameOfDish;
//    }
//
//    public boolean getWouldRecommend () {
//        return wouldRecommend;
//    }
//
//    //SETTERS
//    public void setCostInCents (int newCostInCents) {
//        this.costInCents = newCostInCents;
//    }
//
//    public void setNameOfDish (String newNameOfDish) {
//        this.nameOfDish = newNameOfDish;
//    }
//
//    public void setWouldRecommend (boolean newWouldRecommend) {
//        this.wouldRecommend = newWouldRecommend;
//    }


    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary () {
        System.out.printf("Cost: $%.2f\nName: %s\nRecommended: %b\n", costInCents / 100., nameOfDish, wouldRecommend);
    }

}
