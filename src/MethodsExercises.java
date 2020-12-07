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

        rolePlayingGame();

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

    public static void getInteger(int min, int max){
        Boolean validNumber = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number between " + min + " and " + max + ": ");
            int userNumber = sc.nextInt();
            if (userNumber > max || userNumber < min) {
                System.out.println("This number is invalid");
            }   else if(userNumber<=max && userNumber>=min){
                validNumber = true;
                System.out.println("You have entered a valid number");
            }
        }   while(validNumber == false);

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

    public static void rolePlayingGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Character name: ");
        String character = sc.nextLine();

        System.out.println("Welcome to your adventure, " + character + "!");

        String weapon;
        int userDefense = 0;
        int userAttack = 0;
        int userHealth = 100;
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
        System.out.println("Her is your user profile: ");
        System.out.println("    Weapon of choice: " + weapon);
        System.out.println("    Defense: " + userDefense);
        System.out.println("    Attack: " + userAttack);
        System.out.println("    Health: " + userHealth);
    }
}


