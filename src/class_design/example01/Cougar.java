package class_design.example01;

public class Cougar extends Puma{
    public static void main(String[] args) {
        Puma puma = new Puma();
        System.out.println(puma.getTailLength());
       Cougar puma2 = new Cougar();
        System.out.println(puma2.getTailLength(3));
    }
    public  int getTailLength(int length){
        return 2;
    }
}
