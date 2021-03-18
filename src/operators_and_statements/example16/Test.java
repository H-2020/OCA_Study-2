package operators_and_statements.example16;

public class Test {
    public static void main(String[] args) {
        int n = 1;
        int m = increase(n++);
        System.out.println(m);
        System.out.println(n);
    }

    public static int increase(int i){
        System.out.println(i);
        return i;
    }
}
