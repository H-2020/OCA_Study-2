package methods_and_encapsulation.example03.school;

public class Classroom {
    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54;
    public int floor = 3;

    Classroom(int r, String t){
        roomNumber = r;
        teacherName = t;
    }
}
