package operators_and_statements.example06;

public class CompareValues {
    public static void main(String[] args) {
        int x = 0;
        while(x++ < 10){}

        String message = x > 10 ? "Greater than" : false; // compile error

        System.out.println(message + ", " + x);
    }
}
