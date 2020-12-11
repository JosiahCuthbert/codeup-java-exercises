import java.util.Random;

public class ServerGenerator {

    public static String[] adj = {
            "cool",
            "swarthy",
            "athletic",
            "aggressive",
            "dumb",
            "angry",
            "beautiful",
            "underrated",
            "gargantuan",
            "overpaid",
            "quirky"
    };

    public static String[] noun = {
            "tree",
            "cup",
            "vehicle",
            "duckling",
            "mouse",
            "tide pod",
            "remote",
            "cowboy",
            "bag",
            "guitar",
            "glove"
    };

    public static String randomVal(String[] array){
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }

    public static void main(String[] args){

        System.out.println(randomVal(adj) + " " + randomVal(noun));

    }

}
