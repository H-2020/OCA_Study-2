package arrays;

import java.util.Arrays;
import static java.util.Arrays.asList;

public class Test6 {
    public static void main(String[] args) {
        Arrays.asList(1);
        fly(new int[]{1, 2, 3});
        fly(4, 5, 6, 7);
    }

    public static void fly(int... lengths){
        System.out.println(lengths.length);
    }

    // DOES NOT COMPILE
//    public static void fly(int[] lengths){
//        System.out.println(lengths.length);
//    }
}
