package constractors;

public class Car extends Vehicle{
    int y;
    Car(){
        //super();
      this(10);  //COMPILE ERROR
    }

    Car(int y){
        this.y = y;
    }

    public String toString(){
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car();
        System.out.println(y);
    }
}
