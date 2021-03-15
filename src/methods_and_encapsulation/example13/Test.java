package methods_and_encapsulation.example13;

public class Test {
    int a1;
    public static void doProduct(Integer a){
        a = a * a;
    }

    public static void doString(StringBuilder s){
        s.append(" " + s);
    }

    public static void main(String[] args) {
        Test item = new Test();
        item.a1 = 11;
        StringBuilder sb = new StringBuilder("Hello");
        Integer i = 10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);
    }
}
