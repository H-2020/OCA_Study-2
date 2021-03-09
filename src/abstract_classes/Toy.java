package abstract_classes;

abstract class Toy {
    int price;

    public static void insertToy(){
        System.out.println("hello");
    };

    public abstract int computeDiscount();

    public int calculatePrice(){
        return price;
    }
}
