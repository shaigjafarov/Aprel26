package az.coders.chapter1.lesson15;

import java.util.Optional;
import java.util.Random;

public class OptionalExmp {

    public static void main(String[] args) {
        Optional<String> stringOptional= Optional.of("String");

        Optional<Integer> stringOptional1 = stringOptional.filter(a -> a.equals("Ttring")).map(a->a.length());
        System.out.println(stringOptional1);



        Optional<Double> opt = Optional.empty();
        Optional<Double> opt1 = Optional.ofNullable(5.6);
//        Optional<Double> opt2 = Optional.of(null);
//        System.out.println(opt1.get()); //


        Double aDouble = opt1.filter(a->a>100.0).map(a->a/100).orElse(1.0);
//        Double aDouble1 = opt1.filter(a->a>100.0).map(a->a/100).orElseThrow();
        Double aDouble2 = opt1.filter(a->a>100.0).map(a->a/100).orElseGet(()->new Random().nextDouble());
        System.out.println(aDouble2);
        Optional<UserR> userR = Optional.ofNullable(null);
        userR.ifPresent(a-> a.setName("Arif"));

        System.out.println(userR);


    }


}


class UserR{
    String name;
    Integer id;

    @Override
    public String toString() {
        return "UserR{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}