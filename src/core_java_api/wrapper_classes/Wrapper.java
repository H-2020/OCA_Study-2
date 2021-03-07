package core_java_api.wrapper_classes;

public class Wrapper {
    public static void main(String[] args) {
        short $short = new Short((short) 1);
        $short = Short.valueOf("3");
        System.out.println($short);

        boolean bool = Boolean.parseBoolean("TrUe");
        Boolean Boolean = java.lang.Boolean.valueOf("TrUe");


        float Float = java.lang.Float.parseFloat("1.4F");
        System.out.println(Float);

        long Long = java.lang.Long.parseLong("3");
        System.out.println(Long);

//      long Long = Long.parseLong("3");
        System.out.println(Long);

//        int[] array = new int[0];
//        System.out.println(array.length);
//        array[0] = 4;

        //char $char = Character.parseChar('a');


    }
}
