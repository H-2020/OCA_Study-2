package wrappers;

public class Test {
    public static void main(String[] args) {

        boolean a = (Boolean.valueOf(args[0])); // Gereksiz olsa da hata vermez.
        boolean b = Boolean.parseBoolean(args[1]);
        System.out.println(a + " " + b);
    }
}
