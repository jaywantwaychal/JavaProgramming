package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class countingSort {

    public static void main(String[] args) {
        List<Integer> arr =
            Stream.of(new Integer[]{2, 3, 1}).toList();

      /* int[] result = new int[100];

        for (int i = 0; i< arr.size(); i++) {
            result[arr.get(i)] = result[arr.get(i)]+ 1;
        }
        System.out.println(result);*/

        Integer[] result = new Integer[100];
        Arrays.fill(result, 0);
        for(int i = 0; i< arr.size() ;i++) {

            result[arr.get(i)] = (result[arr.get(i)]).intValue() + 1;

        }
        System.out.println( Arrays.asList(result));
    }

}