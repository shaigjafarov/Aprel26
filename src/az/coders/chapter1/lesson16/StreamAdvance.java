package az.coders.chapter1.lesson16;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAdvance {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(Function.identity(), String::length)); System.out.println(map);

        Map<Integer, String> map1 = ohMy.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2));

    }



}
