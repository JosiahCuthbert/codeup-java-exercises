package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please enter a string");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes or no?");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        } else{
            return false;
        }
    }

    public int getInt(int min, int max){
        Boolean userContinue = true;
        int input;
        do {
            System.out.printf("Please enter a number between %d and %d", min, max);
            System.out.println();
            input = scanner.nextInt();
            if (input > max || input < min) {
                System.out.println("This is not a valid number");
            }   else if(input <= max || input >= min){
                userContinue = false;
            }
        }while(userContinue);
        return input;
    }

    public int getInt(){
        System.out.println("Please enter an int");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        Boolean userContinue = true;
        double input;
        do {
            System.out.printf("Please enter a number between %f and %f", min, max);
            System.out.println();
            input = scanner.nextDouble();
            if (input > max || input < min) {
                System.out.println("This is not a valid number");
            }   else if(input <= max || input >= min){
                userContinue = false;
            }
        }while(userContinue);
        return input;
    }

    public double getDouble(){
        System.out.println("Please enter a double");
        return scanner.nextDouble();
    }
//


}
