package oca_intec.q16;

public class Test {
    public static void testInts(Integer obj, int var){
        obj++;
        obj++;
        obj++;
        var++;
    }

    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1 + " " + val2);
    }
}
