package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Pangram {
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next " +
            "prize";
        String r1 = s.toUpperCase().replace(" ", "");
        char[] arr = r1.toCharArray();
        List<Character> chars = new ArrayList<>();
        for(Character c : arr) {
            chars.add(c);
        }

        Map<Character, List<Character>> result =  chars.stream().collect(Collectors.groupingBy(e -> e));
        System.out.println(result);
        if (result.keySet().size() == 26) {
            System.out.println( "pangram");
        }else {
            System.out.println( "not pangram");
        }
    }
}
