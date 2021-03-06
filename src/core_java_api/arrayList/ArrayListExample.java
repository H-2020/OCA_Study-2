package core_java_api.arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add('a');
        list.add(2.0f);
        list.add(false);
        list.add(Boolean.TRUE);
        list.add(3000L);

        int[] array = new int[0];
        System.out.println("length: " + array.length);
        array[0] = 4;
        System.out.println(array[0]);

        for (Object o:list
        ) {
            System.out.println(o);
        }
    }
}
