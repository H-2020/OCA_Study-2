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
    }//PRIVATE OLDUGU ICIN BU GECERLI OLUYOR.

    public static void main(String[] args) {

        Deer deer2 = new Reindeer(5); // if deer was instance of ReinDeer --> DeerReindeer,true
        System.out.println(","+deer2.hasHorns()); // DeerReindeer,false
    }

}
