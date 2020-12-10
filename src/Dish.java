import java.nio.file.FileSystemNotFoundException;

public class Dish {
    private String name;
    private int cost;
    private Boolean recommendation;

    public Dish(String nameOfDish, int costInCents, Boolean wouldRecommend){
        name = nameOfDish;
        cost = costInCents;
        recommendation = wouldRecommend;
    }


//    public void setCostInCents(int newCost){
//        this.costInCents = newCost;
//    }
    public int getCostInCents(){
        return cost;
    }
//
//
//    public void setnameOfDish(String newName){
//        this.nameOfDish = newName;
//    }
    public String getNameOfDish(){
        return name;
    }
//
//
//    public void setWouldRecommend(Boolean newRecommendation){
//        this.wouldRecommend = newRecommendation;
//    }
    public Boolean getWouldRecommend() {
        return recommendation;
    }

    public void printSummary(){
        System.out.printf("Cost: %d \nName: %s \nRecommended: %b", cost, name, recommendation);

    }

    private static void main(String[] args){

        Dish spaghetti = new Dish("Spaghetti", 1125, true);



        spaghetti.printSummary();
        System.out.println();

        Dish tacos = new Dish("Tacos", 1595, true);

        spaghetti.printSummary();
        System.out.println();

        Dish beefStew = new Dish("Beef Stew", 625, true);

        beefStew.printSummary();
        System.out.println();

    }

}






//    public String name;
//
//    public string getName(){
//        return person.name;
//    }
//
//}


//-- OOP SHORT ASSIGNMENT #1 --
//        Create a class called Dish. This class will represent various restaurant dishes.
//        Include an integer property called “cost”
//        Include a string property called “nameOfDish”
//        Include a boolean property called “re”
//        Include a method called “printSummary” with a void return type
//        this method will use a single printf method to print out the values of each of the instance properties in the following format:
//        Cost: COST_IN_CENTS_HERE
//        Name: NAME_OF_DISH_HERE
//        Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
//        Create another class called DishTest
//        Add a main method and inside the method...
//        1) instantiate a Dish object and assign to a variable called dish1
//        2) assign creative values for each of the properties
//        3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
