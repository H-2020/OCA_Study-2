package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Rob");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")){
            names.remove("Jon");
        }
        System.out.println(names);
    }
}
