package core_java_api.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ConvertingArrayAndList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        Object[] objectArray = list.toArray();
        // String[] stringArray1 = list.toArray(); DOES NOT COMPILE
        String[] stringArray2 = list.toArray(list.toArray(new String[0]));
        String[] stringArray3 = list.toArray(new String[0]);



    }
}
