package class_design.example13;

public class Exam {
    int number = 3;
    public static void print(){
        System.out.println("exam");
    //    print2();
    //    number = 4;
        new Exam().number = 5;
    }

    public void print2(){
        System.out.println("exam2");
    }
}
