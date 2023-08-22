package programming;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
*
* Isogram:
 * This means String should not have duplicate characters.
 *
 * e.g. trip -> is isogram as do not repeat any charaters
 * current -> is not isogram as r r are duplicates.
 *
* */
public class Isogram {

    public static void main(String[] args) {

        System.out.println(isIsogram("Trial"));
        System.out.println(isIsogram("current"));
    }

    private static boolean isIsogram(String trial) {
        char[] charArray = trial.toCharArray();
        long length = charArray.length;
        Set<Character>[] ss = new TreeSet[]{};
        
        List.of(charArray)
               .stream()
               .collect(Collectors.groupingBy(Function.identity()));
//        if(length != sl) {
//            return true;
//        }
        return false;

    }
}
