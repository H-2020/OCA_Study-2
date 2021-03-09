package constractors.example;

public class Car extends Vehicle{
    int y;
    Car(){
        super(10);
    }

    Car(int y){
        super(y);
        this.y = y;
    }

    @Override
    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car(20);
        System.out.println(y);
    }
}

class Vehicle {
    int x;
    Vehicle(){
        this(10);
    }

    Vehicle(int x){
        this.x = x;
    }
}

