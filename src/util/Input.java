

package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    String getString(){
        System.out.println("Please enter a string");
        return scanner.nextLine();
    }

    boolean yesNo(){
        System.out.println("Yes or no?");
        String output = scanner.nextLine();
        if(output.equalsIgnoreCase("y") || output.equalsIgnoreCase("yes")){
            return true;
        } else{
            return false;
        }
    }

//    int getInt(int min, int max){
//
//    }
//
//    int getInt(){
//
//    }
//
//    double getDouble(double min, double max){
//
//    }
//
//    double getDouble(){
//
//    }
//


}
