package operators_and_statements.example12;

public class IncrementOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        if(x++ > ++y){
            System.out.println("Hello");
        } else
            System.out.println("Bye");
    }
}
