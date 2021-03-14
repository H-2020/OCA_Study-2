package oca_intec.q21;

class Base{
    public int value = 10;
    public static int number = 100;
    public Object getValue(){
        return new Object();
    }
}

class Base2 extends Base{
    public int value = 20;
    public static int number = 200;
    public String getValue(){
        return "Hello";
    }
}

public class TestClass {

    public static void main(String[] args) {
        Base b1 = new Base();
        Base2 b2 = new Base2();
        Base b3 = b2;

        System.out.println(b1.getValue() + " " + b1.value + " " + b1.number);
        System.out.println(b2.getValue() + " " + b2.value + " " + b2.number);
        System.out.println(b2.getValue() + " " + b3.value + " " + b3.number);
    }
}
