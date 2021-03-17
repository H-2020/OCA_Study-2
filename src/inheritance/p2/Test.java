package inheritance.p2;

import class_design.example14.p1.Acc;

public class Test extends Acc {
    public static void main(String[] args) {
        Acc obj = new Test();
        System.out.println(obj.s);
    }
}
