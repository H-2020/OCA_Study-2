package class_design.example14.p1;

import class_design.example14.p2.Test;

public class TestInP1 {
    public static void main(String[] args) {
        Acc obj = new Test(); // we have access to default, protected members of Acc from same package
    }
}
