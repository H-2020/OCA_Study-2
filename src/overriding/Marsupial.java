package overriding;

public class Marsupial {
    static int a=10;
    public boolean isBiped(){
        return false;
    }

    public void getMarsupialDescription(){
        System.out.println("Marsupial walks on 2 legs: " + isBiped());
    }
}
