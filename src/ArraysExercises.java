import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args){

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));



        Person joe = new Person("Joe");
        Person kirsten = new Person("Kirsten");
        Person alan = new Person("Alan");
        Person kristen = new Person("Kristen");
        Person chandler = new Person("Chandler");
        Person ben = new Person("Ben");

        Person[] people = {joe, kirsten, alan, kristen};

        Person[] newPeople = addPerson(people, ben);

        for(Person person : newPeople){
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person newPerson){
        int newLength = people.length + 1;
        Person[] newPeople = Arrays.copyOf(people, newLength);
        newPeople[newLength-1] = newPerson;
        return newPeople;
    }

}
