package operators_and_statements.example14;

public class Example14 {
    public static void main(String[] args) {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : a;
        d = (a < b) ? (a < c) ? a : c : a;
        System.out.println(d);
    }
}
