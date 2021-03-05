package operators_and_statements.example10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // list2 = new ArrayList<>();

        list.add(1);
        list.add(60);
        list.add(3);
        list.remove(new Integer(60));

        List<Integer> list2 = new ArrayList<>();
        list.add(Integer.parseInt("6"));
        list.add(Integer.valueOf("5"));
        list.add(3);
        list.add(null);

        for (Integer num:list
        ) {
            System.out.println(num);
        }


    }
}
