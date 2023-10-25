package az.coders.chapter1.lesson29;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {


    public static void main(String[] args) {
        TreeSet<User> users= new TreeSet<>();
        User user= new User();
        users.add(user);
        User user1= new User();
        users.add(user1);
        User user2= new User();
        users.add(user2);
        System.out.println(users);
    }
}
class User extends Object implements Comparable{


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
