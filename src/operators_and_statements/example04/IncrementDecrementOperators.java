package operators_and_statements.example04;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
