package oca_intec.q43;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestClass {
    public static boolean checkList(List list, Predicate<List> p){
        return p.test(list);
    }

    public static void main(String[] args) {
        boolean b = checkList(new ArrayList(), new Predicate<List>() {
            @Override
            public boolean test(List list) {
                return false;
            }
        });
        System.out.println(b);
    }
}
