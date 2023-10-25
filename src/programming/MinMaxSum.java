package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> list2 =
            List.of(769082435, 210437958, 673982045, 375809214, 380564127);
        List<Long> list =
            list2.stream().map(item -> Long.valueOf(item.longValue())).collect(Collectors.toList());

        List<Long> list1 = Optional.ofNullable(list)
            .orElse(new ArrayList<>())
            .stream()
            .map(item -> list.stream().filter(it -> item != it).reduce(Long.valueOf(0),
                Long::sum))
            .sorted()
            .collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list1.get(0) + " " + list1.get(list1.size()-1));
    }
}
