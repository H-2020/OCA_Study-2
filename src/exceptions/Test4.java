package exceptions;

public class Test4 {
    public static void main(String[] args) {
        int ans ;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } //catch (ArithmeticException ae) {
           // ans = 4; // line n1}
        catch (Exception e) {
            ans=7;
            System.out.println("Invalid calculation");
        }
        System.out.println("Answer = " + ans); // line n2
    }
}
