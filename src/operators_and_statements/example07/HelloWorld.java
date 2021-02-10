package operators_and_statements.example07;

public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 0; i < 10;) {
            i = i++; // causes infinite loop. In every loop 0 is assigned to i
            System.out.println("Hello World");
        }
    }
}
