package grades;

import java.util.*;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double bucket = 0;
        for(int grade : grades){
            bucket+=grade;
        }
        return bucket/(grades.size());
    }

    public static void main(String[] args){

        Student joe = new Student("Joe");

        Student kirsten = new Student("Kirsten");

        Student alan = new Student("Alan");

        Student kristen = new Student("Kristen");

    }
}
