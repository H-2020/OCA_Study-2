package class_design.hiding_members;

public class Sub extends Base {
    int i=20; //This i hides Base's i
    static int x = 40; //This x hides Base's x
    public void sayHello(){
        System.out.println("Hello Sub");
    }

    public static void sayBye(){
        System.out.println("Bye Sub");
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.i); // 20
        System.out.println(Sub.x); // 40
        sub.sayHello(); // Hello Sub
        sub.sayBye(); // Bye Sub

        Base sub2 = new Sub();
        System.out.println(sub2.i); // 10
        sub2.sayHello(); // Hello Sub
        sub2.sayBye(); // Bye Base
    }
}

