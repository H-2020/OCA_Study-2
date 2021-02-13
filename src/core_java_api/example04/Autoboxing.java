package core_java_api.example04;

import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        // numbers.remove(1); --> removes 3
        numbers.remove(new Integer(2)); // removes 2
        System.out.println(numbers);
    }
}
