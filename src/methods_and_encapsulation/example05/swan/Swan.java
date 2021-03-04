package methods_and_encapsulation.example05.swan;

import methods_and_encapsulation.example05.bird.Bird;

public class Swan extends Bird {
    public void swim(){
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim(){
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim(){
        Bird other = new Bird();
        // other.floatInWater(); can't access
        // System.out.println(other.text); can't access

    }
}
