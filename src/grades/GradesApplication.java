package grades;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args){

        Student joe = new Student("Joe");
        Student kirsten = new Student("Kirsten");
        Student alan = new Student("Alan");
        Student kristen = new Student("Kristen");

        joe.addGrade(88);
        joe.addGrade(65);
        joe.addGrade(98);

        alan.addGrade(95);
        alan.addGrade(97);
        alan.addGrade(90);

        kirsten.addGrade(100);
        kirsten.addGrade(100);
        kirsten.addGrade(100);

        kristen.addGrade(95);
        kristen.addGrade(93);
        kristen.addGrade(92);

        HashMap<String, Student> students = new HashMap<>();

        students.put("josiahcuthbert", joe);
        students.put("kirstenkillough", kirsten);
        students.put("kristenbrehm", kristen);
        students.put("alanflores", alan);

        studentsCLI(students);

    }

    public static void studentsCLI(HashMap<String, Student> hm){
        System.out.println("Welcome to the grades application!");
        Boolean userContinue;
        Input input = new Input();

        do {
            String yourStudent = "";
            System.out.println();
            System.out.println("Please choose whose grades you would like to view: ");
            Boolean validEntry;

            do {
                System.out.println();
                String chosenStudent = input.getString(githubUsernames(hm));
                if (!hm.containsKey(chosenStudent)) {
                    System.out.println("Sorry, that is not a valid entry. Please choose a different student");
                    validEntry = false;
                } else {
                    yourStudent = chosenStudent;
                    validEntry = true;
                }
            } while (!validEntry);

            printGrades(hm, yourStudent);

            userContinue = input.yesNo("Would you like to view grades for another student?");

        }   while(userContinue);

        System.out.println();
        System.out.println("Goodbye!");

    }

    public static String githubUsernames(HashMap<String, Student> hm) {
        String bucket = "|";
        for (Object key : hm.keySet()) {
            bucket+=" " + key + " |";
        }
        return bucket;
    }

    public static void printGrades(HashMap<String, Student> hm, String yourStudent){
        System.out.println();
        System.out.println("Here are the grades for " + hm.get(yourStudent).getName() +" :");
        System.out.println();
        for(double grade : hm.get(yourStudent).getGrades()){
            System.out.println(grade);
        }
        System.out.println();
        System.out.println("Average: " + hm.get(yourStudent).getGradeAverage());
        System.out.println();
    }

}
