package class_design.example02;

class Reindeer extends Deer{
    public Reindeer(int age){
        // super(); is inserted since there is no explicit call to the parent constructor
        System.out.print("Reindeer");
    }

    public boolean hasHorns(){
        return true;
    }
}
