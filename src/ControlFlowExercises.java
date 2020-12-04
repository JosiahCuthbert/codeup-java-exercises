import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args){

//        Section 1

//        int i = 5;
//        while(i<=15){
//            System.out.println(i);
//            i++;
//        }

//        int j = 100;
//        do{
//            System.out.println(j);
//            j-=5;
//        }   while(j >= -10);

//        long k = 2;
//        do{
//            System.out.println(k);
//            k *= k;
//        }   while(k<=1000000);

//        Section 2

//        for(int i =1;i<=100;i++){
//            if(i % 15 == 0){
//                System.out.println(i + " fizzbuzz");
//                continue;
//            }if(i % 3 == 0){
//                System.out.println(i + " fizz");
//            }if(i % 5 == 0){
//                System.out.println(i + " buzz");
//            }   else{
//                System.out.println(i);
//            }
//        }

//        Section 3

//        System.out.println("How many lines would you like to print?");
//        Scanner sc = new Scanner(System.in);
//        String userString = sc.nextLine();
//        int userInteger = Integer.parseInt(userString);
//
//        System.out.print("Here is your table!\n\nnumber | squared | cubed \n------ | ------- | -----\n");
//
//        for(long i = 1;i<=userInteger;i++){
//            long squared = i*i;
//            long cubed = i*squared;
//            String sixSpaces = "      |";
//            String fiveSpaces = "     |";
//            String sevenSpaces = "       |";
//            String eightSpaces = "        |";
//            if(i < 10 && squared < 10){
//                System.out.println(i + sixSpaces + squared + eightSpaces + cubed);
//            }   else if(i < 10 && squared >=10){
//                System.out.println(i + sixSpaces + squared + sevenSpaces + cubed);
//            }   else {
//                System.out.println(i + fiveSpaces + squared + sixSpaces + cubed);
//            }
//        }

//        Section 4

        System.out.println("What was your grade? (0-100): ");
        Scanner sc = new Scanner(System.in);
        String userString = sc.nextLine();
        int userInteger = Integer.parseInt(userString);

//        System.out.println(userInteger);

        if(userInteger >= 0 && userInteger < 60){
            System.out.println("You got an f :(");
        }else if(userInteger >= 60 && userInteger < 67){
            System.out.println("You got a d");
        }else if(userInteger >= 67 && userInteger < 80){
            System.out.println("You got a c");
        }else if(userInteger >= 80 && userInteger < 88){
            System.out.println("You got a b");
        }else if(userInteger >= 88 && userInteger <= 100){
            System.out.println("You got an a :)");
        }

        System.out.println("Would you like to continue?");
        String userContinue = sc.nextLine();
        if(userContinue.toLowerCase().equals("yes")){
            System.out.println("OK");
        }   else{
            System.out.println("You have discontinued the application");
        }

    }

}
