package core_java_api.wrapper_classes;

public class Wrapper {
    public static void main(String[] args) {
        short $short = new Short((short)1);
        $short = Short.valueOf("3");
        System.out.println($short);
    }
}
