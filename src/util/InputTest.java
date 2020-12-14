package util;

public class InputTest {

    public static void main(String[] args){

        Input input = new Input();

        System.out.println(input.getString("please enter a string"));
        System.out.println();
        System.out.println(input.yesNo("yes or no?"));
        System.out.println();
        System.out.println(input.getDouble(1, 10));
        System.out.println();
        System.out.println(input.getInt(4, 40));
    }

}
