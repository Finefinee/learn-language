package amiddle.array;

import java.util.Arrays;

public class ArrayDi4 {

    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        for (int i = 0; i < arr[2].length; i++) {
            arr[2][i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
