package programming;

import java.util.Arrays;
import java.util.Collections;

public class reverseArrayMetrix {
    public static void main(String[] args) {

        //array reverse
        Integer[] arr = {1, 2, 4, 6, 7, 8};
        System.out.println("Integer Array: " + Arrays.toString(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Reverse 1: " + Arrays.toString(arr));
        int[] arr1 = {1, 2, 4, 6, 7, 8};
        System.out.println("int Array: " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length / 2; i++) {
          /*
          //with temp variable
          int x = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = x;*/

            //without temp variable
            arr1[i] = arr1[i] + arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = arr1[i] - arr1[arr1.length - 1 - i];
            arr1[i] = arr1[i] - arr1[arr1.length - 1 - i];
        }
        System.out.println("reversed int array:" + Arrays.toString(arr1));

        System.out.println("2d array row reverse----------------");
        Integer[][] arr2 = {{2, 3, 4}, {4, 5, 7}};
        System.out.println("2d array: " + Arrays.deepToString(arr2));

        Arrays.asList(arr2).stream().forEach(integers -> Collections.reverse(Arrays.asList(integers)));

        System.out.println("2d integer reverse array (row reverse): " + Arrays.deepToString(arr2));

        int[][] arr3 = {{2, 3, 4}, {4, 5, 7}};
        System.out.println("2d int array: " + Arrays.deepToString(arr3));

        Arrays.asList(arr3)
                .stream()
                .forEach(ints -> reverseArray(ints));

        System.out.println("2d int reverse array (row reverse): " + Arrays.deepToString(arr3));

        System.out.println("2d Integer array: (column): ==============");
        Integer[][] arr4 = {{2, 3, 4}, {4, 5, 7}};
        System.out.println("2d Integer array: " + Arrays.deepToString(arr4));

        Integer[][]arr5 = new Integer[arr4.length][arr4[0].length];
        for (int r = 0; r < arr4.length; r++) {
            for (int c = 0; c < arr4[0].length; c++) {

                arr5[arr4.length - 1 - r][arr4[0].length - 1 - c] = arr4[r][c];

            }
        }

        System.out.println("2d Integer reverse array(column reverse): " + Arrays.deepToString(arr5));
    }

    private static void reverseArray(int[] ints) {
        for (int i = 0; i < ints.length / 2; i++) {
            ints[i] = ints[i] + ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = ints[i] - ints[ints.length - 1 - i];
            ints[i] = ints[i] - ints[ints.length - 1 - i];
        }
    }

}
