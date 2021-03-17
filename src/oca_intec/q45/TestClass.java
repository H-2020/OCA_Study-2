package oca_intec.q45;

class Base{
    public Number getValue(){
        return 1;
    }
}

class Base2 extends Base{
    public Integer getValue(){
        return 2;
    }
}

public class TestClass {
    public static void main(String[] args) {
        Base b = new Base2();
        System.out.println(b.getValue());
    }
}
