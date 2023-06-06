package az.coders.chapter1.lesson14;

import java.util.List;
import java.util.stream.Stream;

public class StreamI {

    public static void main(String[] args) {
        Stream<String> stream =Stream.of("1","2","3","4");
//        stream.


                var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
        list.parallelStream();


    }
}
