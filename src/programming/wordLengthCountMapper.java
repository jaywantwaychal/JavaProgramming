package programming;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class wordLengthCountMapper {

    public static void main(String[] args) throws IOException {
        String path = "F:\\workspaces\\IntelliJWorkspaces\\java\\JavaProgramming\\src\\programming\\wordAnalyzer.java";
        List<String> wordList = Files.lines(Path.of(path))
                .flatMap(lines -> Arrays.stream(lines.split("\\W+")))
                .filter(word -> !word.isBlank())
                .collect(Collectors.toUnmodifiableList());


        new wordLengthCountMapper().counter(wordList);
    }

    private void counter(List<String> wordList) {

        Map<Integer, List<String>> result = wordList.stream().distinct()
                .collect(Collectors.toMap(Function.identity(), String::length))
                .entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));

        Map<Integer, Integer> collect = result.entrySet().stream()
                .collect(Collectors.toMap(integerListEntry -> integerListEntry.getKey(), integerListEntry -> integerListEntry.getValue().size()));
        System.out.println(collect);
    }
}
