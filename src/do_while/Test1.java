package do_while;

public class Test1 {
    public static void main(String[] args) {
        int x;
        x = 3;
        do{
            System.out.print("*");
            x--;
        } while (x>=0);

        System.out.println();

        x = 0;
        do{
            System.out.print("*");
        } while (x++ < 3);

        System.out.println();

        x = 3;
        do{
            System.out.print("*");
            x--;
        } while (x != 1);
    }
}
