package arrays;

public class Test {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];


        arr[0] = new int[]{1, 3, 5, 7};
    //     arr[1] = new int[]{1, 3};
            arr[1][0] = 1;
            arr[1][1] = 3;


        for (int[] a : arr){
            for (int i: a
            ) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }

        for (int[] a : arr){
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + "  ");
            }
            System.out.println();
        }

        int[] arr2 = new int[4];
        arr2[0] = 1;
        arr2[1] = 3;

        for (int a:arr2
        ) {
            System.out.print(a + " ");
        }
    }
}
