package az.coders.chapter1.lesson12;

import java.util.ArrayList;
import java.util.List;

public class UnBound {


    public static void printList(List<Object> list) {
        for (Object x : list)
            System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
//        printList(keywords);
    }
}


class C {


}

class D extends C {


}

class E extends D {


}

class Test {


    void testq(List<? super E> deList) {
        deList.add(new E());
    }

    void testqw(List<? extends D> deList) {
//           list
    }


}

interface I<E>{


    default  E get(E e){


        return e;
    }

}
class F <W> implements I<W>{



}
class J <L> extends F<L>{


}