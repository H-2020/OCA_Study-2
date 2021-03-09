package class_design.ternary_operator;

public class Main {
    public static void main(String[] args) {
        int x = 100;
        int a = x++; // 100
        int b = ++x; // 102
        int c = x++; // 102
        // x = 103
        //System.out.println(b);
        int d = (a < b) ? (a < c) ? a: (b < c) ? b : c : x;
        System.out.println(d);
    }
}
