package az.coders.chapter1.lesson17;

import java.lang.annotation.Repeatable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionBy {



    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() >5 ));

        System.out.println(map); // {false=[], true=[lions, tigers, bears]}
    }
}
