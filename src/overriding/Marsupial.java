package overriding;

public class Marsupial {
    public boolean isBiped(){
        return false;
    }

    public void getMarsupialDescription(){
        System.out.println("Marsupial walks on 2 legs: " + isBiped());
    }
}
