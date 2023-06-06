package az.coders.chapter1.lesson14;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExpLamStre {

    public static void main(String[] args) {
        new ExpLamStre().bizimIterate(new StringBuilder("salam"), a -> a.append("2"), b ->b.length()<14);



    }

    <T> void bizimIterate(T baslangic, UnaryOperator<T> deyerChange, Predicate<T> shert) {
        while (shert.test(baslangic)) {
            System.out.println(baslangic);
            deyerChange.apply(baslangic);
        }
    }
}
