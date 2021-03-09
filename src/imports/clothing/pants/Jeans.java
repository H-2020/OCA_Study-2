package imports.clothing.pants;

import imports.clothing.Shirt;

public class Jeans {
    public void matchShirt(){
        String color = Shirt.getColor();
        if(color.equals("Green")){
            System.out.println("fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}
