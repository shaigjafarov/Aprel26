package az.coders.chapter1.lesson17;

import javax.swing.text.html.Option;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupBy {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map = ohMy.collect(

                Collectors.groupingBy(String::length, Collectors.joining(",")));


        System.out.println(map);


    }
}
