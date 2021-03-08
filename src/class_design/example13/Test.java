package class_design.example13;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Exam exam = new Exam();

        System.out.println(isAvailable + " ");
        isAvailable = test.doStuff();
        System.out.println(isAvailable);
        exam.print();
    }

    static boolean isAvailable = false;

    public static boolean doStuff(){
        return !isAvailable;
    }
}
