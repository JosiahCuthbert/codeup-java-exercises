public class Person {

    private static String name;

    public Person(String personName){
        name = personName;
    }

    public String getName(){
        return Person.name;
    }

    public void setName(String name){
        Person.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello, %s!", getName());
        System.out.println();
    }

    public static void main(String[] args){

//        Person joe = new Person("Joe");
//
//        joe.sayHello();
//
//        joe.setName("Josiah");
//
//        joe.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }
}
