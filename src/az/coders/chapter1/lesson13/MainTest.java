package az.coders.chapter1.lesson13;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class MainTest {

    String ss (String s){
        return s.concat("ss");
    }
    public static void main(String[] args) {

        TestI<String> stringTestI= new MainTest()::ss;
        Scanner sc= new Scanner(System.in);
//        Calculate<Integer, Double> calculate= (a,b )->(double) (a)/b;

        Calculate<Integer, Double> calculate= new Calculate<Integer, Double>() {
            @Override
            public Double cem(Integer x1, Integer x2) {
                return (double) (x1)/x2;
            }
        };


        MainTest.<Integer,Double>apply(2,3,calculate);


    }
    static <E,R> void  apply(E x1, E x2, Calculate<E, R> calculateLam){

        System.out.println(calculateLam.cem(x1,x2));
    }
}

@FunctionalInterface
interface   Calculate<E, D> {


    D cem(E x1, E x2);


}@FunctionalInterface
interface   TestI<E> {


    E nese(E x1);


}


