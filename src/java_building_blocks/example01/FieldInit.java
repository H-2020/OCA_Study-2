package java_building_blocks.example01;

public class FieldInit {
    Character c;
    boolean b;
    float f;

    void printAll(){
        System.out.println(c);
        System.out.println(b);
        System.out.println(f);
    }

    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        f.printAll();
    }
}
