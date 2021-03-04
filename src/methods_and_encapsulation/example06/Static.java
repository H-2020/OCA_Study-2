package methods_and_encapsulation.example06;

public class Static {
    private String name = "Static class";
    public static void first() { }
    public static void second() { }
    public static void third() {
        System.out.println(new Static().name);
    }

    public static void main(String args[]) {
        first();
        second();
        third(); // DOES NOT COMPILE
    }
}
