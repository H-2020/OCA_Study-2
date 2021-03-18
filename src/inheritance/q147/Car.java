package inheritance.q147;

public class Car extends Vehicle{
    String trans;

    /*public Car(String trans) {
        super(trans);
        this.trans = trans;
    }*/

    public Car(String s, int speed, String trans) {
        super(s, speed);
      //  this(trans);
    }
}
