package exceptions;

public class Test2 {
    public static void main(String[] args) {
        int ans;
        try {

        } catch (ArithmeticException ae){
            ans = 0;
        } catch (Exception e){
            System.out.println("Invalid calculation");
        }
    //    System.out.println("Answer = " + ans); // COMPILE ERROR, var not initialized
    }
}
