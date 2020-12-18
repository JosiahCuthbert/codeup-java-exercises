package Grocery;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryApp {

    public static void main(String[] args){

    groceryCLI();

    }

    public static void groceryCLI(){

        Input input = new Input();

        System.out.println("Welcome to the grocery app!");



        Boolean createList = input.yesNo("Would you like to create a grocery list? (yes/no)");
        if(!createList){
            System.out.println("Bye!");
            return;
        }

        HashMap<String, GroceryItem> userList = new HashMap<>();

        Boolean finalize;
        do {
            Boolean createItem = input.yesNo("Would you like to enter a new item?");
            if (!createItem) {
                return;
            }

            String categoryInput = input.getString("Select which category your item is in from the following: \n1. Produce\n2. Baked Goods\n3. Meat\n4. Snacks\n5. Other ");
            if (categoryInput.equalsIgnoreCase("1") || categoryInput.equalsIgnoreCase("produce")) {
                categoryInput = "Produce";
            }
            if (categoryInput.equalsIgnoreCase("2") || categoryInput.equalsIgnoreCase("baked goods")) {
                categoryInput = "Baked Goods";
            }
            if (categoryInput.equalsIgnoreCase("3") || categoryInput.equalsIgnoreCase("meat")) {
                categoryInput = "Meat";
            }
            if (categoryInput.equalsIgnoreCase("4") || categoryInput.equalsIgnoreCase("snacks")) {
                categoryInput = "Snacks";
            }
            if (categoryInput.equalsIgnoreCase("5") || categoryInput.equalsIgnoreCase("other")) {
                categoryInput = "Other";
            }

            String nameInput = input.getString("Please enter the name of your item.");
            int quantityInput = input.getInt("Please enter the quantity of your item.");

            GroceryItem newItem = new GroceryItem(nameInput, quantityInput);
            userList.put(categoryInput, newItem);

            finalize = input.yesNo("Would you like to finalize your list?");

        }   while(!finalize);

        System.out.println("Your list has been finalized");

    }

    public static void printList(HashMap<String, GroceryItem> hm){



    }

}
