package az.coders.chapter1.lesson10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedSetExmpl {
    public static void main(String[] args) {
        Set<String> stringSet= new LinkedHashSet<>();

        for (int i = 0; i < 100; i++) {
            stringSet.add("i"+i);
        }
        stringSet.forEach(System.out::println);
    }
}
