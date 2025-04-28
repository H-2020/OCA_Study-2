package overriding;

public class Kangaroo extends Marsupial {
    static int a=8;
    public boolean isBiped(){
        return true;
    }

    public void getKangarooDescription(){
        System.out.println("Kangaroo hops on 2 legs: " + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
        System.out.println(a);;
        Marsupial joey2 = new Kangaroo();
        System.out.println(a);

    }
}
