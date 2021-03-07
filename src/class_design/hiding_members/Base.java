package class_design.hiding_members;

public class Base {
    int i=10;
    static int x = 30;
    public void sayHello(){
        System.out.println("Hello Base");
    }

    public static void sayBye(){
        System.out.println("Bye Base");
    }
}
