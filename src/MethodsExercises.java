import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static void main(String[] args){

//        System.out.println(add(2,3));
//
//        System.out.println(subtract(5,3));
//
//        System.out.println(multiply(3,4));
//
//        System.out.println(divide(12,4));
//
//        System.out.println(modulus(12,4));

//        getInteger(1, 10);

//        diceRoll();

//        rolePlayingGame();

        factorial();
    }

    public static int add(int num1, int num2){
        return (num1 + num2);
    }

    public static int subtract(int num1, int num2){
        return (num1 - num2);
    }

    public static int multiply(int num1, int num2){
        return (num1 * num2);
    }

    public static int divide(int num1, int num2){
        return (num1 / num2);
    }

    public static int modulus(int num1, int num2){
        return (num1 % num2);
    }

    public static int getInteger(int min, int max){
        Boolean validNumber = false;
        int userNumber;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number between " + min + " and " + max + ": ");
            userNumber = sc.nextInt();
            if (userNumber > max || userNumber < min) {
                System.out.println("This number is invalid");
            }   else if(userNumber<=max && userNumber>=min){
                validNumber = true;
                System.out.println();
                System.out.println("You have entered a valid number");

            }
        }   while(validNumber == false);

        return userNumber;
    }

    public static void diceRoll(){
        String userContinue;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("How many sides on your dice?");
            int sides = sc.nextInt();
            Random rand = new Random();
            for(int i = 1;i<=2;i++){
                int random = rand.nextInt(sides) + 1;
                System.out.println("die " + i + ": " + random);
            }

            System.out.println("would you like to continue? (Y/N)");
            userContinue = sc.next();

        }   while(userContinue.equalsIgnoreCase("y"));

    }

    public static void factorial(){
        Boolean userContinue;
        do {
            userContinue = false;
            int userInteger = getInteger(1, 10);
            int solution = 1;
            String start = "";
            String bucket = "";
            for (int i = 1; i <= userInteger; i++) {
                solution *= i;
                if (i < userInteger) {
                    bucket += (i + " x ");
                }
                if (i == userInteger) {
                    start += (i + "! = ");
                    bucket += (i + " = ");
                }
            }

            System.out.println();
            System.out.println(start + bucket + solution);
            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.println("Would you like to continue? (Y/N)");
            if(sc.nextLine().equalsIgnoreCase("y")){
                userContinue = true;
            }
        }   while(userContinue);

        System.out.println();
        System.out.println("Bye!!!");
    }

    public static void rolePlayingGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Character name: ");
        String character = sc.nextLine();

        System.out.println("Welcome to your adventure, " + character + "!");
        System.out.println();
        System.out.print("You are a warrior stuck in a faraway land.");
        System.out.print("To make it back to your home you must battle three great monsters.");
        System.out.print("Can you defeat all three to make it home safely?");
        System.out.println();


        String weapon;
        int userDefense = 0;
        int userAttack = 0;
        int userHealth = 100;
        int potions = 3;
        int atkBoost = 1;
        int defBoost = 1;
        Boolean validWeapon;
        do {
            System.out.println("Choose your weapon (Sword/Axe/Hammer): ");
            weapon = sc.nextLine();
            if(weapon.equalsIgnoreCase("sword")){
                userDefense = 3;
                userAttack = 7;
                validWeapon = true;
            }   else if(weapon.equalsIgnoreCase("axe")){
                userDefense = 5;
                userAttack = 5;
                validWeapon = true;
            }   else if(weapon.equalsIgnoreCase("hammer")){
                userDefense = 7;
                userAttack = 3;
                validWeapon = true;
            }   else{
                validWeapon = false;
            }
        }   while(!validWeapon);

        System.out.println();

        printStats(weapon, userDefense, userAttack, userHealth);

        System.out.println();

        printInventory(potions, atkBoost, defBoost);

        Boolean readyToBattle;
        do {
            readyToBattle = false;
            System.out.println();
            System.out.println("Are you ready to battle? (Y/N)");
            String battleReady = sc.nextLine();
            if(battleReady.equalsIgnoreCase("y")){
                readyToBattle = true;
            }
        }   while(!readyToBattle);

        System.out.println("Your first opponent is THE TERRIBLE TROLL!!!");
        System.out.println("The terrible troll is very powerful, but is susceptible to speedier attacks.");

    }

    public static void printStats(String weapon, int defense, int attack, int health){
        System.out.println("Here are your user stats: ");
        System.out.println("    Weapon of choice: " + weapon);
        System.out.println("    Defense: " + defense);
        System.out.println("    Attack: " + attack);
        System.out.println("    Health: " + health);
    }

    public static void printInventory(int potions, int atkBoost, int defBoost){
        System.out.println("Here is your current item inventory");
        System.out.println("    Health Potions: " + potions);
        System.out.println("    Attack Boosts: " + atkBoost);
        System.out.println("    Defense Boosts: " + defBoost);
    }

    public static void trollAttack(){

    }

}


