package class_design.example13;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Exam exam = new Exam();

        System.out.println(isAvailable + " ");
        isAvailable = test.doStuff();

        System.out.println(isAvailable);
        exam.print();

        test.doAnotherStuff();
    }

    static boolean isAvailable = false;

    public void doAnotherStuff(){
        Exam exam = new Exam();
        exam.print();

        Test test = new Test();
        test.doStuff();


    }

    public static boolean doStuff(){
        return !isAvailable;
    }
}
