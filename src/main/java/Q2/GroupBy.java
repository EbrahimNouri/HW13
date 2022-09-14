package Q2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<String> alef = Arrays.asList("geek", "for", "geek");
        Map<Integer, List<String>> rr2 = alef.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer, Long> rr1 = alef.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(rr1);
        System.out.println(rr2);
    }
}
