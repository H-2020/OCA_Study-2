package exceptions;

public class Test2 {
    public static void main(String[] args) {
        int ans;
        try {
            int num = 10;
            int div = 0;
            ans = num/div;
        } catch (ArithmeticException ae){
            ans = 8;
        } catch (Exception e){
            ans = 3;
            System.out.println("Invalid calculation");
        }
        System.out.println("Answer = " + ans); // COMPILE ERROR, var not initialized
    }
}
