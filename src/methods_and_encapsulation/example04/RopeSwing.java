package methods_and_encapsulation.example04;

public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    static {
        System.out.println("static");
    }

    {
        System.out.println("instance block");
    }

    static {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        RopeSwing ropeSwing = new RopeSwing();
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }
}
