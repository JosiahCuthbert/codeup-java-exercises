public class DishTools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static String shoutDishName(Dish dish){
        return dish.getNameOfDish().toUpperCase();
    }

    public static String analyzeDishCost(Dish dish){
        if(dish.getCostInCents() > DishTools.AVERAGE_COST_OF_DISH_IN_CENTS){
            return dish.getCostInCents() + " is more expensive than the average dish.";
        }   else if(dish.getCostInCents() < DishTools.AVERAGE_COST_OF_DISH_IN_CENTS){
            return dish.getCostInCents() + " is less expensive than the average dish.";
        }   else{
            return "This dish costs exactly the same as the average dish.";
        }
    }

    public static void flipRecommendation(Dish dish){
        if(dish.getWouldRecommend()){
            dish = new Dish(dish.getNameOfDish(), dish.getCostInCents(), false);
            System.out.println("Recommendation has been changed from true to false for " + dish.getNameOfDish());
        }   else if(!dish.getWouldRecommend()){
            dish = new Dish(dish.getNameOfDish(), dish.getCostInCents(), true);
            System.out.println("Recommendation has been changed from false to true for " + dish.getNameOfDish());

        }
        System.out.println();
        dish.printSummary();
    }




    public static void main(String[] args){



    }

}

//-- SHORT ASSIGNMENT #2 --
//        Create a class of static members (variables and methods) called DishTools
//  - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
//          - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//          - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”,
//          depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//          - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//          Try out the DishTools methods with Dish objects in the DishTest main method
//
//          Refactor your Dish and DishTest classes...
//          1) Change all properties in the Dish class to private visibility (printSummary should remain public)
//  2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
//          3) Refactor code as needed in DishTest to access and modify dish object property values
//          4) Add a constructor method to Dish that will assign all properties
//          5) Refactor DishTest again to use the constructor to set all property values rather than setter methods