package class_design.example14.p2;

import class_design.example14.p1.Acc;

public class Test extends Acc {
    public static void main(String[] args) {
        // obj1 can't access to protected members of Acc, since it is not a subclass of Acc
        Acc obj1 = new Test();

        // obj2 has access to protected members of Acc since Test is a subclass of Acc
        Test obj2 = new Test();
        obj2.sayBye();

        printHello();

    }

    // We can access protected static methods from a static context
    public static void printHello(){
        sayHello();
    }
}
