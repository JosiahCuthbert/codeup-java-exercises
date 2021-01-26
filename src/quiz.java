import java.util.ArrayList;
import java.util.List;

public class quiz {

    public static void main(String[] args){

        int[] arr1 = {-1, 3, 8, 2, 9, 5};
        int[] arr2 = {4, 1, 2, 10, 5, 20};

//        for(int num : closest(arr1, arr2, 24)){
//            System.out.println(num);
//        }
//
//        String[] words = {"a", "aaa", "b", "bbb", "ccc"};
//
//        wordsWithoutList(words, 3);

        System.out.println(isEndy(9));

        for(int num : copyEndy(arr1, 3)){
            System.out.println(num);
        }


    }

    public static int[] closest(int[] arr1, int[] arr2, int target){
        Boolean start  = false;
        int out1 = 0;
        int out2 = 0;
        int range = 0;
        for(int num : arr1){
            for(int i = 0; i<arr2.length;i++){
                int instanceRange = nonNeg(target -  (arr2[i]+num));
                if(!start || instanceRange < range){
                    start = true;
                    range = instanceRange;
                    out1 = num;
                    out2 = arr2[i];
                }
            }
        }
        return new int[]{out1, out2};
    }

    public static int nonNeg(int num){
        if(num<0){
            return num * -1;
        }	else{
            return num;
        }


    }


    public int wordsCount(String[] words, int len) {
        int count = 0;
        for(String word : words){
            if(word.length() == len){
                count++;
            }
        }
        return count;
    }


    public static List wordsWithoutList(String[] words, int len) {
        ArrayList<String> output = new ArrayList<>();
        for(String word : words){
            if(word.length() != len){
                output.add(word);
            }
        }
        return output;
    }

    public static int[] copyEndy(int[] nums, int count) {
        int[] output = new int[count];
        int index = 0;
        for(int num : nums){
            if(isEndy(num) && index < count){
                output[index] = num;
            }
        }
        return output;
    }

    public static Boolean isEndy(int n){
        return (n >= 5 && n <= 10) || (n >= 90 && n <= 100);
    }

//    why doesnt github recognize non-main commits?!?


}
