package programming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class arrayMergeSort {
    public static void main(String[] args) {

        int[] nums1 = {4, 2, 6, 5, 0, 0, 0};
        int m = 4;
        int[] nums2 = {1, 9, 7};
        int n = 3;

        String b = "dfghj dfhgjk asiudac asodijhaocbo nasuhdaoiudh";

        Map<String, Long> collect = Arrays.stream(b.split(" ")).flatMap(s -> Arrays.stream(s.split(""))).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.entrySet().stream().forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey() + " -> " + stringLongEntry.getValue()));

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
       // new arrayMergeSort().removeDuplicate(nums);
        //System.out.println(new arrayMergeSort().removeElement(nums, 2));
    }

    private void removeDuplicate(int[] nums) {

        //Predicate<Integer> predicate = (p) -> p.equals(3).
        //Arrays.stream(nums).boxed().distinct().forEach(System.out::println);

    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                nums1[m + i] = nums2[i];
            }
            Arrays.sort(nums1);
        }
       // Arrays.stream(nums1).forEach(System.out::println);
    }

    public int removeElement(int[] nums, int val) {
        int d = nums.length;
        return Arrays.stream(nums)
                .filter(value -> value != val)
                .boxed()
                .toList().size();
    }
}
