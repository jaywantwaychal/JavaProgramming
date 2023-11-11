package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MarsSOS {
    public static void main(String[] args) {
        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
        int beginIndex = 0;
        int endIndex = 3;
        List<String> list = new ArrayList<>();
        while(endIndex <= s.length()) {
            list.add(s.substring(beginIndex, endIndex));
            beginIndex = endIndex;
            endIndex = endIndex+3;
        }
        list.forEach(System.out::println);
        List<String> error = list.stream().filter(str -> !str.equalsIgnoreCase("SOS"))
            .collect(Collectors.toList());

        System.out.println(error.size());
    }
}
