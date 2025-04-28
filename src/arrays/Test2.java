package arrays;

public class Test2 {
    public static void main(String[] args) {
        String names [] = {"Thomas", "Peter", "Joseph"};
        String pwd [] = new String[3];
int i=0;
        try {
            for(String n:names){
                pwd[i]=n.substring(2,6);
                i++;
            }
           // String name = "Peter".substring(2, 6);
            //System.out.println(name);
        } catch (Exception exception){
            System.out.println("Invalid name");
        }
        for(String p:pwd){
            System.out.println(p);
        }
    }
}
