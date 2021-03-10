package hiding;

public class Jellyfish extends Animal {
    public int length = 5;

    public static void main(String[] args) {
        Jellyfish jellyfish = new Jellyfish();
        Animal animal = new Jellyfish();

        System.out.println(jellyfish.length);
        System.out.println(animal.length);
        print(jellyfish);
    }

    public static void print(Animal jellyfish){
        System.out.println(jellyfish.length);
    }
}

class Animal {
    public int length = 2;
}
