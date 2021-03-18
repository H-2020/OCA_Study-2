package mixed.q09;

public class Person {
    public String name;
    public void setName(String name){
        String title = "Dr. ";
        name = title + name;
    }

    public String toString() {
        return name;
    }
}
