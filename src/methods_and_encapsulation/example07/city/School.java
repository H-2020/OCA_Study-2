package methods_and_encapsulation.example07.city;

import methods_and_encapsulation.example07.school.*;

public class School extends Classroom {

    public School(int r, String t) {
        super(r, t);
    }

    public void call(){
        System.out.println(roomNumber);
        System.out.println(floor);
        greet();
    }

    public static void main(String[] args) {
        System.out.println(Classroom.globalKey);
        Classroom room = new Classroom(101, "Ahmet");

        System.out.println(roomNumber);
        System.out.println(room.floor);
        System.out.println(room.teacherName);
        room.greet();
    }
}
