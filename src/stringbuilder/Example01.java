package stringbuilder;

public class Example01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        String str1 = sb.toString();
        String str2 = sb.toString();
        String str3 = str1;

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // true

    }
}
