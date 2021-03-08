package class_design.static_instance_relations;

public class App {
    int count;
    public static void displayMsg(){
   //     count++;
   //     System.out.println("Welcome " + " Visit Count: " + count); DOES NOT COMPILE
    }

    public static void main(String[] args) {
        App.displayMsg();
        App.displayMsg();
    }
}
