package az.coders.chapter1.lesson11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExp {


    public static void main(String[] args) {
//        LocalDate.now().compareTo()
        List<A> aList = new ArrayList<>();
        aList.add(new A(2));
        aList.add(new A(3));
        aList.add(new A(1));
        aList.add(new A(4));


//        Collections.sort(aList);


        Collections.sort(aList, new ForSort());
        System.out.println(aList);
    }


}

class A {
    int age;

    public A(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                '}';
    }
}

class ForSort implements Comparator<A> {

    @Override
    public int compare(A a1, A a2) {
        if (a1.age > a2.age)
            return 1;
        else if (a1.age < a2.age)
            return -1;
        else
            return 0;
    }
}
