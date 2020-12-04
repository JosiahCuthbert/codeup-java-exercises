import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){

//        double pi = 3.14159;

//        System.out.printf("The value of pi is approximately %s", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("What is your first name?: ");
//        String firstName = scanner.next();
//
//        System.out.print("What is your middle name?: ");
//        String middleName = scanner.next();
//
//        System.out.print("What is your last name?: ");
//        String lastName = scanner.next();
//
//        System.out.print("Your full name is: " + firstName + " " + middleName + " " + lastName);

//        System.out.print("What is your favorite sentence? ");
//        String sentence = scanner.nextLine();
//
//        System.out.print("This was the sentence you provided: " + sentence);

        System.out.print("please provide the width of CodeUp's classroom: ");
        String width = scanner.nextLine();
        int intWidth = Integer.parseInt(width);

        System.out.print("please provide the height of CodeUp's classroom: ");
        String height = scanner.nextLine();
        int intHeight = Integer.parseInt(height);

        int area = intWidth*intHeight;
        int perimeter = (intWidth*2) + (intHeight*2);

        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);

    }

}
