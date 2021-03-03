package exceptions;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        try {
            i += 1;
            e();
            i += 2;
        } catch (Exception e) {
            i += 4;
        } finally {
            i += 8;
            System.out.print(i);
        }
    }

    private static void e() {
        throw new IllegalArgumentException();
    }
}
