package switchs;

public class Test2 {
    static int color;
    public static void main(String[] args) {
        char colorCode = 'y';

        switch (colorCode){
            case 'r':
                 color = 100;
                break;
            case 'b':
                color = 10;
                break;
            case 'y':
                color = 1;
                System.out.println(color);
                break;
        }
       System.out.println(color); //COMPILE ERROR
    }
}
