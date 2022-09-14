package Q2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        final List<String> MAIN_LIST = Arrays.asList("ebrahim", "amir", "ali", "reza", "hatef");
        Map<Integer, List<String>> be = MAIN_LIST.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer, Long> alef = MAIN_LIST.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(alef);
        System.out.println(be);
    }
}
