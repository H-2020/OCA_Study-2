package methods_and_encapsulation.example08;

public class RopeSwing {
    private static final String leftRope;
    private static final String rightRope;
    // private static final String bench; // COMPILE ERROR
    private static final String name = "name";

    static {
    //    name = "name"; COMPILE ERROR
        rightRope = "right";
    }


    static {
        leftRope = "left";
    //    rightRope = "right"; COMPILE ERROR
    }

    public static void main(String[] args) {
        //bench = "bench"; COMPILE ERROR
    }
}
