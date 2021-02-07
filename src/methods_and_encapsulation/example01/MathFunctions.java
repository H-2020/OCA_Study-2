package methods_and_encapsulation.example01;

public class MathFunctions {
    public static void addToInt(int x, int amountToAdd){
        x = x + amountToAdd;
        System.out.println(x); // 25
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        MathFunctions.addToInt(a,b);
        System.out.println(a); // 15
    }
}
