package oca_intec.q59;

public class Switcher {
    public static void main(String[] args) {
        switch(Integer.parseInt("2")){
            case 0 :
                boolean b = false;
                break;
            case 1 :
                b = true;
                break;
        }
    //    if(b) --> not reachable
            System.out.println(3);
    }
}
