package interfaces;

public interface Test {
    int a = 1;
    public abstract void print();
    public default void hello(){
        System.out.println("Hello");
    }
}
