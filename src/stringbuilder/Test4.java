package stringbuilder;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.delete(0, sb.length());
        System.out.println(sb);
    }
}
