public class MethodsExercises {

    public static void main(String[] args){

        System.out.println(add(2,3));

        System.out.println(subtract(5,3));

        System.out.println(multiply(3,4));

        System.out.println(divide(12,4));

        System.out.println(modulus(12,4));

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
}
