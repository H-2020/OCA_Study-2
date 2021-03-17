package exceptions;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
// ArrayList myList = new ArrayList();
        ArrayList myList = new ArrayList();
        String myarray[];
        try{
            while(true){ //infinite loop so Exception in thread “main” java.lang.OutOfMemoryError: Java heap space
                myList.add("My string");
            }
        }catch (RuntimeException re){
            System.out.println("caught RuntimeException");
        }catch (Exception e){
            System.out.println("caught Exception");
        }
        System.out.println("Ready to use");
    }
}
