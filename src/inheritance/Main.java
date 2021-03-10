package inheritance;

public class Main {
    public static void main(String[] args) {
        /*C2 obj1 = new C1();
        I obj2 = new C1();

        C2 s = (C2) obj2;
        I t = (I) obj1;

        t.displayI();
        s.displayC2();*/

       /* Peacock b = new Peacock();
        Bird p = (Bird)b;
        p.fly();*/

        /*Bird p = new Peacock();
        p.fly();*/

        /*Bird b = new Peacock();
        Peacock p = (Peacock) b;
        p.fly();
        p.dance();*/

        // CLASS CAST EXCEPTION
        /*Bird b = new Bird();
        Peacock p = (Peacock)b;
        p.fly();
        p.dance();*/

        Peacock p = new Peacock();
        p.dance();
        p.fly();


    }
}
