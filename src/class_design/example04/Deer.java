package class_design.example04;

public class Deer {
    static int count;
    static { count = 0; }

    Deer() {
        count++;
    }

    public static void main(String[] args) {
        count++;
        System.out.println(count);
        Deer mother = new Deer();
        Deer father = new Deer();
        Deer fawn = new Deer();
        System.out.println(father.count);
        System.out.println(Deer.count);
    }
}
