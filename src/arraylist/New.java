package arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class New {
    public static void main(String[] args) {


        int x=0;



        while(isAvailable(x)){
            System.out.println(--x);
        }
    }
    public static boolean isAvailable(int x){
        return --x>0 ? true:false;
    }
}
