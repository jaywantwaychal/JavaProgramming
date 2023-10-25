package programming;

import java.util.Arrays;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) {

        List<String> strings =
            Arrays.asList("def", "de", "fgh");

        List<String> queries =
            Arrays.asList("de", "lmn", "fgh");
        Integer[] result = new Integer[queries.size()];

        // Write your code here
        for(int i= 0; i < queries.size(); i++) {
            for (String string : strings) {
                if (string.equals(queries.get(i))) {
                    result[i] = (result[i]==null? 0: result[i]) + 1;
                }
            }
        }
        Arrays.stream(result).forEach(System.out::print);
    }
}
