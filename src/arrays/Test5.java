package arrays;

public class Test5 {
    public static void main(String[] args) {
        String[] strs = {"A", "B"};
        int idx = 0;
        for(String s : strs){
             strs[idx].concat(" element " + idx);
            idx++;
        }
        System.out.println(idx);
        for (idx = 0; idx < strs.length ; idx++) {
            System.out.println(strs[idx]);
        }
    }

    //final static void hello(){};
}
