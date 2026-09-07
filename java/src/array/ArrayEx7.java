package amiddle.array;

import java.util.Arrays;

public class ArrayEx7 {

    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++) {
            array[i][3] = 1;
        }

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
