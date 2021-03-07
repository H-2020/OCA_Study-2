package methods_and_encapsulation.example09;

public class TestCall {
    public static void main(String[] args) {
        Caller c = new Caller();
 //       c.start(); DOES NOT COMPILE
 //       c.init();  DOES NOT COMPILE
    }
}

class Caller{
    private void init(){
        System.out.println("initiliazed");
    }

    private void start(){
        init();
        System.out.println("started");
    }
}
