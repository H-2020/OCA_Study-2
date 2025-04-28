package operators_and_statements.example05;

public class MultipleTerms {
    public static void main(String[] args) {
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10 ; x++, y++) {
            System.out.print(y + " ");
        }
        //System.out.println(x);
        x+=2*7;
        System.out.println(x);
    }
}
