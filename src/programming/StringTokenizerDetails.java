package programming;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringTokenizerDetails {
    public static void main(String[] args) {
        try {
            List<String> strings = List.of("fgh", "sadd", "sdrwe", "wercwfe");
            strings.stream().map(String::length).collect(Collectors.toList());

            IntSummaryStatistics intSummaryStatistics = strings.stream().mapToInt(String::length).summaryStatistics();
            System.out.println(intSummaryStatistics);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\workspaces\\IntelliJWorkspaces\\java\\JavaProgramming\\src\\programming\\Fibonacci.java")));
            String read;
            Map<String, Long> mapper = new HashMap<>();
            while(bufferedReader.readLine() !=null){
                read = bufferedReader.readLine();
                mapper = Collections.list(new StringTokenizer(read, " ,:;{}[]()=!<>?.+\"-")).stream()
                        .map(Object::toString)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

                mapper.entrySet().stream().forEach(System.out::println);

            }



        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
