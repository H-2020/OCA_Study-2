package operators_and_statements.example15;

public class Test {
    public static void main(String[] args) {
        int x = 5;
        while(isAvailable(x)){
            System.out.print(x);
            x--;
        }
    }

    private static boolean isAvailable(int x) {
        return x-- > 0 ? true : false;
    }
}
