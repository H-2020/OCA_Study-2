package imports.clothing.pants;

//import imports.clothing.Shirt;

import static imports.clothing.Shirt.getColor;

public class Jeans {
    public void matchShirt(){
        String color = getColor();
        if(color.equals("Green")){
            System.out.println("fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}
