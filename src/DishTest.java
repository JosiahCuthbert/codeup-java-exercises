public class DishTest {

    public static void main(String[] args){

        Dish dish1 = new Dish("Kung Pao Chicken", 1300, true);

        Dish dish2 = new Dish("Pizza", 800, true);

//        dish1.printSummary();

        System.out.println();
        System.out.println(DishTools.shoutDishName(dish1));

        System.out.println();
        System.out.println(DishTools.analyzeDishCost(dish1));

        System.out.println();
        DishTools.flipRecommendation(dish1);

    }

}
