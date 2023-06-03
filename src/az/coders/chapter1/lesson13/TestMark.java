package az.coders.chapter1.lesson13;

import java.io.Serializable;
import java.util.List;

public class TestMark {


    public static void main(String[] args) {

       Functional<String> functional= new Functional<>() {
           @Override
           public void a(String s) {
               System.out.println(s.toUpperCase());
           }
       };


       Functional<String> functionalLambda= (s)-> System.out.println(s.toUpperCase());

        List.of(1,2,3,45).forEach(System.out::println);



    }
}
@FunctionalInterface
interface Functional<E>{

    void a(E e);


    default void d(){}
}
