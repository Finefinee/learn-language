package amiddle.array;

public class ArrayDi3 {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println();
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
