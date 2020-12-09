public class DishTest {

    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.setNameOfDish("Turkey Burger");
        dish1.setCostInCents(1200);
        dish1.setWouldRecommend(true);
        dish1.printSummary();
        System.out.println();

        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);
    }





}
