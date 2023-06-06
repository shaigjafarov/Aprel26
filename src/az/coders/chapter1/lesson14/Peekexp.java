package az.coders.chapter1.lesson14;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

public class Peekexp {
static  int count;
    public static void main(String[] args) {

   Stream.generate(UUID::randomUUID).map(UUID::toString).peek((a)->{
               System.out.println(++count);
           })
        .filter((a->a.startsWith("5"))).peek(System.out::println).limit(10).count();
    }
}
