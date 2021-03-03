package class_design.example07;

public class MantaRay implements CanSwim {
    @Override
    public void swim() {
        System.out.println("He can swim at speed " + SPEED);
    }
}
