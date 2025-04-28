package class_design.example06;

public class Mammal {
    public Mammal(int age){
        System.out.println("1");
    }

    public Mammal() {
        System.out.println("3");
    }

    public static void main(String[] args) {
        Mammal M=  new Mammal();
        Mammal H=  new Hippopotamus();

    }
}

class Hippopotamus extends Mammal{
    public Hippopotamus(){
        super();
        System.out.println("2");
    }
}


