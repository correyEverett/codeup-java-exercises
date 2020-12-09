public class DishTest {

    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.nameOfDish = "Turkey Burger";
        dish1.costInCents = 899;
        dish1.wouldRecommend = true;
        dish1.printSummary();
        System.out.println();

//        DishTools dish = new DishTools();
        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);
    }


}
