package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));

        if(arrList.removeIf(s -> { System.out.println(s+ " removed"); return s.length() <= 2;})){

        };
        for (String str:arrList
        ) {
            System.out.println(str);
        }
    }
}
