package class_design.example02;

public class Deer {
    public Deer(){
        System.out.print("Deer");
    }

    public Deer(int age){
        System.out.print("DeerAge");
    }

    private boolean hasHorns(){
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5); // if deer was instance of ReinDeer --> DeerReindeer,true
        System.out.println(","+deer.hasHorns()); // DeerReindeer,false
    }

}
