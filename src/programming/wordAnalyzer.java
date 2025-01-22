package programming;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class wordAnalyzer {

    private static final String FILE_PATH = "F:\\workspaces\\IntelliJWorkspaces\\java\\JavaProgramming\\src";//"F:\\workspaces\\IntelliJWorkspaces\\java\\JavaProgramming\\src\\programming";

    public static void main(String[] args) throws IOException {
        Integer rank = 1;
        boolean isHighest = true;
        List<String> highst = new wordAnalyzer().getNthValues(FILE_PATH, 4, isHighest);

        List<String> lowest = new wordAnalyzer().getNthValues(FILE_PATH, 3, false);
        System.out.println(highst);
        System.out.println(lowest);
    }

    private List<String> getNthValues(String filePath, Integer rank, boolean isHighest) throws IOException {

        List<Path> files = Files.walk(Paths.get(FILE_PATH))
                .filter(Files::isRegularFile)
                .collect(Collectors.toUnmodifiableList());

        //  files.stream().forEach(System.out::println);
        Map<String, Long> words = new HashMap<>();
        for (Path file : files) {
            Files.lines(file)
                    .flatMap(lines -> Arrays.stream(lines.split("\\W+")))
                    .filter(word -> !word.isEmpty())
                    .forEach(word -> words.merge(word, 1L, Long::sum));
        }

        // words.entrySet().stream().forEach(stringLongEntry -> System.out.println(stringLongEntry));

        Map<Long, List<String>> collect = words.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        System.out.println(collect);

        List<Long> frequecy = collect.entrySet().stream()
                .map(longListEntry -> longListEntry.getKey()).collect(Collectors.toUnmodifiableList());

        List<Long> sortedFrequency = isHighest ? frequecy.stream().sorted(Comparator.reverseOrder()).toList() :
                    frequecy.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(sortedFrequency);
       return collect.get(sortedFrequency.get(rank-1));



        /*for(Path file: files) {
            Map<String, Long> collect = Files.lines(file)
                    .flatMap(lines -> Arrays.stream(lines.split("\\W+")))
                    .filter(word -> !word.isEmpty())
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(file);
            System.out.println(collect);
        }*/
        //return null;
    }
}
