package arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] stack = {10, 20, 30};
        int size = 3;
        int idx = 0;

       /* while(idx < size-1){
            idx++;
        }*/

        do{
            idx++;
        } while (idx < size-1);

        System.out.println(stack[idx]);
    }
}
