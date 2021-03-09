package exceptions;

public class Test {
    public static void main(String[] args) throws Exception {
        test();
    }

    public static void test() throws Exception{
        try{
            System.out.println("Try");
            throw new RuntimeException();
        } catch (RuntimeException e){
            System.out.println("catch");
            throw new RuntimeException();
        } finally {
            System.out.println("finally");
            throw new Exception();
        }
    }
}
