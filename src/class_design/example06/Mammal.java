package class_design.example06;

public class Mammal {
    public Mammal(int age){
        System.out.println("1");
    }

    public Mammal() {

    }
}

class Hippopotamus extends Mammal{
    public Hippopotamus(){
        super();
        System.out.println("2");
    }
}


