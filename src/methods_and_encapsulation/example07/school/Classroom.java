package methods_and_encapsulation.example07.school;

public class Classroom {
    protected static int roomNumber;
    public String teacherName;
    public static int globalKey = 12345; // can't access default from another package
    protected static int floor = 3;

    protected static void greet(){}

    public Classroom(int r, String t){
        roomNumber = r;
        teacherName = t;
    }
}
