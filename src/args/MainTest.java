package args;

//public class MainTest {
 //   public static void main(String[] args) {
//        System.out.println("String main " + args[0]);
//    }
//}
interface Nocturnal {
 default boolean isBlind() { return true; }
 }
public class MainTest implements Nocturnal {

             public boolean isBlind() { return false; }
 public static void main(String[] args) {
        Nocturnal nocturnal = new MainTest();
        System.out.println(nocturnal.isBlind());
         }
 }