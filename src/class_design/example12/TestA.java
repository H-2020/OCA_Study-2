package class_design.example12;

class Alpha {
    int ns;
    static int s;
    Alpha(int ns){
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint(){
        System.out.println("ns = " + ns + " s = " + s);
    }
}

public class TestA{
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(100);
        ref1.doPrint();
        Alpha ref2 = new Alpha(50);
        ref2.doPrint();
        Alpha ref3 = new Alpha(125);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}
