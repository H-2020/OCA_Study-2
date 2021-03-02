package class_design.example05;

public class Climber {
    static Climb climb = (height, limit) -> height>limit;

    public static void main(String[] args) {
        check(climb, 5);
    }
    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}

// Since the interface takes two parameters, the lambda expression needs to as well.
// It correctly specifies the parameters and the code functions as if we defined the lambda in an interface.
// Line 7 passes a height of 5 and the lambda expression is for deferred execution. check() calls the code and
// actually executes it.


