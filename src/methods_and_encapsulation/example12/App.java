package methods_and_encapsulation.example12;

public class App {
    int count;
    public static void displayMsg(){
    //    System.out.println("Welcome " + count++); Non static count can not be called from a static context
    }

    public static void main(String[] args) {
        App.displayMsg();
        displayMsg();
    }
}
