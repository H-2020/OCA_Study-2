package arrays;

public class Test2 {
    public static void main(String[] args) {
        String names [] = {"Tom", "Peter", "Joseph"};
        String pwd [] = new String[3];

        try {
            String name = "Peter".substring(2, 6);
            System.out.println(name);
        } catch (Exception exception){
            System.out.println("Invalid name");
        }
    }
}
